import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Değişkenler Tanımlandı
        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik,GecmeNotu;

        //Kullanıcıdan veri alabilmek için input nesnesi oluşturuldu
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Ders Notları Alındı
        System.out.println("Matematik Ders Notunuzu Girin");
        Matematik=input.nextInt();

        System.out.println("Fizik Ders Notunuzu Girin");
        Fizik = input.nextInt();

        System.out.println("Kimya Ders Notunuzu Girin");
        Kimya=input.nextInt();

        System.out.println("Turkçe Ders Notunuzu Gririn");
        Turkce=input.nextInt();

        System.out.println("Tarih Ders Notunuzu Girin");
        Tarih=input.nextInt();

        System.out.println("Müzik Notunuzu Girin");
        Muzik=input.nextInt();

        //Ders Notu Ortalaması Hesaplandı
        System.out.println("Ortalamanız hesaplanıyor ...");
        double Ortalama = (Matematik+Fizik+Kimya+Turkce+Tarih+Muzik)/6;

        //Ders Notu Ortalaması Ekrana Yazdırıldı
        System.out.println("Ders Notu Ortalamanız: " + Ortalama);

        //Sınıf Geçme Durumu Ekrana Yazdırıldı
        System.out.println(Ortalama >=60 ? "Tebrikler Sınıfı Geçtiniz" : "Malesef Sınıfı Geçemediniz");
}}