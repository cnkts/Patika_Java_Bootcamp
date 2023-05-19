import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler tanımlandı
        Double lenght,weight,result;
        Scanner input=new Scanner(System.in);

        //Kullanıcıdan veriler alınıyor
        System.out.print("Lütfen kilonuzu yazın : ");
        weight=input.nextDouble();

        System.out.print("Boyunuzu metre olarak (or: 1,83) şeklinde yazın : ");
        lenght=input.nextDouble();

        //Vücut endeksi hesaplanıyor
        result=weight/(lenght*lenght);
        System.out.print("Vücut Kitle Endeksiniz : "+ result);

    }
}