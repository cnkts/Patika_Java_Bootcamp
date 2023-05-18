import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler tanımlandı
        int sayi,tmpSayi,toplam;
        //Scanner sınıfından bir nesne oluşturuldu
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan bir sayı girmesi istendi
        System.out.print("Bir sayı giriniz = ");
        sayi=input.nextInt();
        //Değişkenlere değer atandı
        tmpSayi=sayi;
        toplam=0;
        //Kullanıcının girdiği sayının rakalmları toplandı
        while (tmpSayi != 0) {
            toplam += tmpSayi % 10;
            tmpSayi /= 10;
        }
        //Sonuç ekrana yazdırıldı
        System.out.println("Sayının basamakları toplamı = " + toplam);
    }

}