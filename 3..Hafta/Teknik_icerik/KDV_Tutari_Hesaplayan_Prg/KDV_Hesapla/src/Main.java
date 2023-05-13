import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Değişkenler Tanımlandı
        Byte Kdv = 18;
        Double KdvliMiktar;
        Double Miktar;
        Double sonuc;

        // Kullanıcıdan Fiyat Bilgisi Alındı
        System.out.println("Kdv hesaplamak için tutar yazıp enter tuşuna basın");
        Scanner input = new Scanner(System.in);
        Miktar=input.nextDouble();

        //Kdv Hesaplaması Yapıldı
        sonuc= Miktar>=1000 ? KdvliMiktar=(Miktar*8/100)+Miktar : (Miktar*18/100)+Miktar;

        //Kdvli ve Kdvsiz Miktarlar Ekrana Yazdırıldı
        System.out.println("KDV'siz fiyat : "+Miktar);
        System.out.println("Hesaplanan KDV dahil fiyat : "+sonuc);
    }
}