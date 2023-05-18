import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler tanımlandı
        int sayi,toplam=0;
        //Scanner sınıfından nesne üretildi
        Scanner scanner=new Scanner((System.in));
       // Kullanıcıdan sayı alındı 2 ve 4 ün katları toplandı eğer sayı tek ise sonuç ekrana yazdırıldı
        do{
            System.out.print("Bir sayi giriniz:");
            sayi=scanner.nextInt();
            if((sayi%2==0) && (sayi%4==0)){
                toplam+=sayi;
            }
            sayi++;
        }while(sayi%2!=0);
        System.out.println("Toplam="+toplam);



    }
}