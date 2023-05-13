import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenler Tanımlandı
        Double  mesafe,toplam_Tutar,km_Fiyat,min_Tutar,acilis_Ucreti,min_km;
        Boolean taksimetre_Acildimi;

        //Değişkenlere Değer Atandı
        km_Fiyat=2.20;
        min_km=4.54;
        min_Tutar=20.0;
        acilis_Ucreti=10.0;

        //Kullanıcıya Mesaj Yazdırıldı
        System.out.print("Ücret Hesaplaması İçin Gidilen Km Bilgisini Yazın : ");

        //Kullanıcıdan Veri Alındı
        Scanner input = new Scanner(System.in);
        mesafe = input.nextDouble();
        toplam_Tutar=mesafe*km_Fiyat+acilis_Ucreti;
        System.out.println("Taksimetre Açılış Ücreti : "+acilis_Ucreti);
        System.out.println("Km ücreti : "+ km_Fiyat);
        System.out.print("Gidilen Mesafeye Göre Ödemeniz Gereken Ücret : " + toplam_Tutar);

    }
}