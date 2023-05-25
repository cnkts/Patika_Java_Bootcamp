import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Scanner sınıfınfan bir nesne türetildi

        System.out.print("Bir sayi girinizi :");  //Ekrana yazı yazdırıldı

        int n = input.nextInt(); //Kullanıcının girdiği değer değişkene atandı

        if (isPrime(n, 2)) //Asal sayı kontorlü

            System.out.println(n + " Sayısı Asaldır");
        else
            System.out.println(n + " Asal Sayı Değildir");

    }

    static boolean isPrime(int n, int i) {
        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false; //kullanıcının girdiği sayı ikiye eşitse true gönder değilse false gönder

        if (n % i == 0)       // kullanıcının girdiği sayının 2 ye bölümünden kalan sıfırsa false döndür
            return false;
        if (i * i > n)     //
            return true;
        // Check for next divisor
        return isPrime(n, i + 1);
    }

}