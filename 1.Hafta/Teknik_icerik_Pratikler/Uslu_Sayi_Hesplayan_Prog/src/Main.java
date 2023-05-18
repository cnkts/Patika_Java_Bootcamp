import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner sınıfından bir nesne ürettik
        Scanner scan = new Scanner(System.in);
        //Değişkenler tanımlandı
        int sayi1, sayi2,sonuc=1;

        System.out.print("Üssü alınacak rakamı girin : ");
        sayi1=scan.nextInt();
        System.out.print("Kaç Üssü alınacak?  : ");
        sayi2=scan.nextInt();

        for (int i=1; i<=sayi2; i++){
            sonuc*=sayi1;
        }
        System.out.print("soncu ="+ sonuc);
    }
}