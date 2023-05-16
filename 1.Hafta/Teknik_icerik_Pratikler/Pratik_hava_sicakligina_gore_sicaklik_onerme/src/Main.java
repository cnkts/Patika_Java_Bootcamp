import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler tanımlanıyor
        String kayak,sinema,piknik,yuzme;
        Short derece;
        Scanner input=new Scanner(System.in);

        //Kullanıcıya sıcaklık soruluyor
        System.out.print("Hava Sıcaklığı Kaç Derece : ");
        derece=input.nextShort();

        //hava sıcaklık koşullarına göre etkinlik önerilıyor
        if(derece<5){System.out.print("Bugün kayak yapmaya gidebilirsin");}
        if(5<derece && derece<15){System.out.print("Bugün sinemaya gidebilirsin");}
        if(15<derece && derece<25){System.out.print("Bugün piknik yapmaya gidebilirsin");}
        if(derece>25){System.out.print("Bugün kayak yüzmeye gidebilirsin");}


    }
}