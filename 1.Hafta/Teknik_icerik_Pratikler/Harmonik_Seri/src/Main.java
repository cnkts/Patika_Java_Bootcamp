import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler tanımlandı
        int sayi;
        double toplam;
        //Scanner Sınıfından bir nesne türetildi
        Scanner scanner=new Scanner(System.in);
        //Kullanıcıdan bir sayı girmesi istendi
        System.out.print("Bir sayi giriniz:");
        //Kullanıcının girdiği sayı değişkene atandı
        sayi=scanner.nextInt();
        toplam=0.0;
        for (int i=1; i<=sayi; i++){
            toplam+=(1.0/i);
        }
        System.out.println("Harmonik Seri Toplami:"+toplam);
    }
}