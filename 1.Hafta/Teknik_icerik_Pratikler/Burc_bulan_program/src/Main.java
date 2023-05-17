import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler tanımlandı
        Byte month,Day;
        Scanner input =new Scanner(System.in);
        //Kullanıcıdan bilgiler alındı
        System.out.print("Doğduğunuz Ayı Rakam Olarak Yazın : ");
        month=input.nextByte();
        System.out.print("Doğduğunuz Günü Rakam Olarak Yazın : ");
        Day=input.nextByte();

        //Burc bulma işlemi
        if(month == 3 && Day>=21)System.out.println("Burcunuz Koç");
        else if (month == 4 && Day<=20) System.out.println("Burcunuz Koç");

        if(month == 4 && Day>=21)System.out.println("Burcunuz Boğa");
        else if (month == 5 && Day<=21) System.out.println("Burcunuz Boğa");

        if(month == 5 && Day>=22)System.out.println("Burcunuz İkizler");
        else if (month == 6 && Day<=22) System.out.println("Burcunuz İkizler");

        if(month == 6 && Day>=23)System.out.println("Burcunuz Yengeç");
        else if (month == 7 && Day<=22) System.out.println("Burcunuz Yengeç");

        if(month == 7 && Day>=23)System.out.println("Burcunuz Aslan");
        else if (month == 8 && Day<=22) System.out.println("Burcunuz Aslan");

        if(month == 8 && Day>=23)System.out.println("Burcunuz Başak");
        else if (month == 9 && Day<=22) System.out.println("Burcunuz Başak");

        if(month == 9 && Day>=23)System.out.println("Burcunuz Terazi");
        else if (month == 10 && Day<=22) System.out.println("Burcunuz Terazi");

        if(month == 10 && Day>=23)System.out.println("Burcunuz Akrep");
        else if (month == 11 && Day<=21) System.out.println("Burcunuz Akrep");

        if(month == 11 && Day>=22)System.out.println("Burcunuz Yay");
        else if (month == 12 && Day<=21) System.out.println("Burcunuz Yay");

        if(month == 12 && Day>=22)System.out.println("Burcunuz Oğlak");
        else if (month == 1 && Day<=21) System.out.println("Burcunuz Oğlak");

        if(month == 1 && Day>=22)System.out.println("Burcunuz Kova");
        else if (month == 2 && Day<=19) System.out.println("Burcunuz Kova");

        if(month == 2 && Day>=20)System.out.println("Burcunuz Balık");
        else if (month == 3 && Day<=20) System.out.println("Burcunuz Balık");

    }
}








































//c.a
