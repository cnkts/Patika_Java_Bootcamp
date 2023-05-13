import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Değişkenler tanımlandı
        Double lenght,weight,result;
        Scanner input=new Scanner(System.in);

        //Kullanıcıdan veriler alınıyor
        System.out.print("Kilonuzu kg olarak yazın : ");
        weight=input.nextDouble();
        System.out.print("Boyunuzu metre olarak yazın : ");
        lenght=input.nextDouble();

        //Vücut endeksi hesaplanıyor
        result=weight/(lenght*lenght);
        System.out.print("Vücut Kitle Endeksiniz : "+ result);



    }
}