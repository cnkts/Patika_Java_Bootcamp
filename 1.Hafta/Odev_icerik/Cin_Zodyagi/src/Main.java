import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner sınıfından bir nesne türedildi
        Scanner scanner=new Scanner(System.in);
        //Ekrana metin yazdırıldı
        System.out.print("Doğum Yılınız : ");
        //Kullanıcının girdiği değer d_yili değişkenine atandı
        int d_yili=scanner.nextInt();
        //Burc değişkenine doğumyılı/12 den çıkan sonuç atandı.
        int burc=d_yili%12;
        //switch ile yapılan hesaplama sonucuna göre burç belirlendi ve ekrana yazdırıldı
        switch (burc){

            case 0 :
                System.out.println("Çin Zodyağı Burcunuz : At" );
                break;
            case 1 :
                System.out.println("Çin Zodyağı Burcunuz : Horoz" );
                break;
            case 2 :
                System.out.println("Çin Zodyağı Burcunuz : Köpek" );
                break;
            case 3 :
                System.out.println("Çin Zodyağı Burcunuz : Domuz" );
                break;
            case 4 :
                System.out.println("Çin Zodyağı Burcunuz : Fare" );
                break;
            case 5 :
                System.out.println("Çin Zodyağı Burcunuz : Öküz" );
                break;
            case 6 :
                System.out.println("Çin Zodyağı Burcunuz : Kaplan" );
                break;
            case 7 :
                System.out.println("Çin Zodyağı Burcunuz : Tavşan" );
                break;
            case 8 :
                System.out.println("Çin Zodyağı Burcunuz : Ejderya" );
                break;
            case 9 :
                System.out.println("Çin Zodyağı Burcunuz : Yılan" );
                break;
            case 10 :
                System.out.println("Çin Zodyağı Burcunuz : At" );
                break;
            case 11 :
                System.out.println("Çin Zodyağı Burcunuz : Koyun" );
                break;
        }

    }
}