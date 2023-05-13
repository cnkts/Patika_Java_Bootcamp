import java.awt.event.ComponentEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri Tanımlanıyor
        Integer A_Kenari,B_Kenari,Alan,Cevre;
        Double C_Kenari;
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan Veriler Alınıyor
        System.out.print("Ücgenin 1. Kenar Uzunluğunu Giriniz : ");
        A_Kenari=input.nextInt();
        System.out.print("Üçgenin 2. Kenar Uzunluğunu Giriniz : ");
        B_Kenari=input.nextInt();
        //Hipotenüs Hesaplanıyor
        C_Kenari= Math.sqrt((A_Kenari*A_Kenari)+(B_Kenari*B_Kenari));
        System.out.println("Hipotenüs = " + C_Kenari);
        //Üçgenin Alanı Hesaplanıyor
        Alan= A_Kenari*B_Kenari/2;
        System.out.println("Üçgenin Alanı : " +Alan);
        //Üçgenin Çevresi Hesaplanıyor
        Cevre=A_Kenari+B_Kenari+C_Kenari.intValue();
        System.out.println("Üçgenin Çevresi : "+ Cevre);




    }
}