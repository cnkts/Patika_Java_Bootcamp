import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Değişkenler tanımlanıyor
        Scanner input = new Scanner(System.in);
        Integer Matematik, Fizik, Turkce, Kimya, Muzik,toplam=0,ortalama;

        //Kullanıcıdan notlar alınıyor
        System.out.println("Ders Notlarınızı Yazın");
        System.out.print("Matematik : ");
        Matematik=input.nextInt();

        //Girilen ders notunun 100 den küçük 0 dan büyük olup olmadığı kontrol ediliyor.
        // eğer şart sağlanmıyorsa ders notu ortalamaya katılmıyor.
        //tüm ders notları için bu kontrol yapılıyor
        if(Matematik>100 || Matematik<0){
            Matematik=0;
            System.out.println("Matematik dersi hesaplamaya dahil edilmedi!");
        }
        else {
            toplam=Matematik;
            System.out.println("Matematik dersi hesaplamaya dahil edildi");
        }

        System.out.print("Fizik : ");
        Fizik=input.nextInt();

        if(Fizik>100||Fizik<0){
            Fizik=0;
            System.out.println("Fizik dersi hesaplamaya dahil edilmedi!");
        }
        else{
            toplam=Fizik+toplam;
            System.out.println("Fizik dersi hesaplamaya dahil edildi");
        }

        System.out.print("Türkçe : ");
        Turkce=input.nextInt();

        if(Turkce>100||Turkce<0){
            Fizik=0;
            System.out.println("Turkçe dersi hesaplamaya dahil edilmedi!");
        }
        else{
            toplam=Turkce+toplam;
            System.out.println("Turkçe dersi hesaplamaya dahil edildi");
        }

        System.out.print("Kimya : ");
        Kimya=input.nextInt();

        if(Kimya>100||Kimya<0){
            Kimya=0;
            System.out.println("Kimya dersi hesaplamaya dahil edilmedi!");
        }
        else{
            toplam=Kimya+toplam;
            System.out.println("Kimya dersi hesaplamaya dahil edildi");
        }

        System.out.print("Müzik : ");
        Muzik=input.nextInt();

        if( Muzik>100|| Muzik<0){
            Muzik=0;
            System.out.println("Muzik dersi hesaplamaya dahil edilmedi!");
        }
        else{
            toplam= Muzik+toplam;
            System.out.println("Muzik dersi hesaplamaya dahil edildi");
        }

        //girilen derslerin ortalaması hesaplanıyor
        ortalama=toplam/5;
        System.out.println("Ders Notu Ortalamanız : " + ortalama);

        //Sınıfı geçip geçmediği kullanıcıya yazdırılıyor
        if(ortalama<55){
            System.out.println("Bu ortalama ile malesef sınıfta kaldınız");
        }
        else{
            System.out.println("Tebrikler Sınıfı "+ortalama+" ile geçtiniz");
        }
    }
}