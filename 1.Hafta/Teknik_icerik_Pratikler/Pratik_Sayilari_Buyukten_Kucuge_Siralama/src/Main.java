import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler tanımlanıyor
        int a, b, c;
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan sayılar alınıyor
        System.out.print("1.Sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        b = input.nextInt();
        System.out.print("3.Sayıyı giriniz: ");
        c = input.nextInt();
        //Koşullar kontrol ediliyor ve koşula uyan yazdırılıyor.
        if ((a>b) && (a>c)){
            if (b>c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        }else if((b>a) && (b>c) ){
            if (a>c){
                System.out.println("b>a>c");
            }else{
                System.out.println("b>c>a");
            }
        }else if((c>b)&&(c>a)){
            if(a>b){
                System.out.println("c > a > b");
            }else{
                System.out.println("c > b >a");
            }
        }
    }
}