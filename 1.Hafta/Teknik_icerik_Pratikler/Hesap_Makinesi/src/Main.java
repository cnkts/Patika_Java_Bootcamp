import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler tanımlandı
        Integer sayi1,sayi2,sonuc,islem;


        //kullanıcıdan ilk sayı alındı
        System.out.print("Birinci Sayı : ");
        Scanner input= new Scanner(System.in);
        sayi1=input.nextInt();

        //Kullanıcıdan ikinci sayı alındı
        System.out.print("ikinci Sayı : ");
        sayi2= input.nextInt();
        //Islem Seçimi Yapılıyor
        System.out.println("Klavyeden yapmak istediğiniz işlemi tuşlayın \n1:Toplama\n2:Çıkarma\n3:Çarpma\n4:Bölme\n");
        islem=input.nextInt();
        //Seçilen işlem yapılıyor
        switch (islem)
        {
            case(1) :{
                sonuc=sayi1+sayi2;
                System.out.print("Toplama İşlemi Sonucu : "+sonuc);
                break;
            }
            case(2):{
                sonuc=sayi1-sayi2;
                System.out.println("Çıkarma İşlemi Sonucu : "+sonuc);
                break;
            }

            case(3) : {
                sonuc=sayi1*sayi2;
                System.out.println("Çarpma İşlemi Sonucu: "+ sonuc);
                break;
            }
            case(4):{
                sonuc=sayi1/sayi2;
                System.out.println("Bölme İşlemi Sonucu : "+ sonuc);
                break;
            }
            //Kullanıcı 1 ile 4 arasında bir seçim yapmazsa bu kod çalışacak
            default:{
                System.out.println("Lütfen 1 ile 4 arasında bir secim yapın");
            }
        }
    }
}