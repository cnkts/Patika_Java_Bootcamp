import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler tanımlandı
        int sayi,toplam=0;
        //Scanner sınıfından scan nesnesi türetildi
        Scanner scan = new Scanner(System.in);
        //tek sayı girilene kadar kullanıcının girdiği çift sayıları kontrol eden ve bu sayılardan sadece 4 ün katı olanları
       // toplauan do while döngüsü
        do {
            System.out.println("Sayı Giriniz : ");
            sayi=scan.nextInt();
            if (sayi%2==0 && sayi%4==0){
                toplam+=sayi;
            }
            }
        //kullanıcı tek sayı girerse sayı istemeyi durdurup 4 ün katı olanların toplamını yazdırdı
        while (sayi%2==0);
            System.out.println("Toplam : "+toplam);
    }
}