import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in); // Scanner sınıfından bir scanner nesnesi türetildi.
        System.out.print("Taban değrti giriniz : ");
        int base=scanner.nextInt(); //Kullanıcıdan taban sayısı alındı value1 değişkenine aktarıldı
        System.out.print("Üs değeri giriniz : ");
        int powerRaised=scanner.nextInt(); //Kullanıcıdan taban sayısı alındı value2 değişkenine aktarıldı
        int result = power(base, powerRaised); //Sonuç değişkenine Recursive method aktarıldı
        System.out.println(base + "^" + powerRaised + "=" + result);// üs alma sonucu ekrana yazdırıldı
       }
    public static int power(int base, int powerRaised) {
        if (powerRaised != 0) {  //üs değeri 0 dan küçük değilse işeleme devam et
            // recursive call to power()
            return (base * power(base, powerRaised - 1)); //burada üs değeri sayaç mantığında her dönüşte bir azaltılıyor.
        } else {
            return 1;
        }

    }
}
