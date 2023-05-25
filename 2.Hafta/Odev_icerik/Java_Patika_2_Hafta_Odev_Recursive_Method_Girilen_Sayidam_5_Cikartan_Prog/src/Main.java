import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Scanner sınıfından bir nesne tanımlandı
        System.out.print("Sayı giriniz : "); //Kullanıcıdan bir sayı istendi
        int n = scan.nextInt(); //Kullanıcının girdiği sayı n değişkenine atandı
        int count = n; //count değişkenine n değişkeni atandı
        min1(n, count); //minius 1 fonksiyonu 2 parametre ile çağrıldı
        }

    static void min1(int n, int count) { //min1 fonksiyonu n sayısı 0 dan büyük olduğu sürece önce n değişkenini ekrana yazdıracak
                                        //ardından n den 5 çıkarıp değeri parametre olarak kendine gönderecek.
        if (n > 0) {
            System.out.print(n + " ");
            min1(n - 5, count);
        } else if (n <= 0) {            //n sayısı sıfıra eşit olduğunda min2 fonksiyonu çağrılacak.
            min2(n, count);
        }
    }

    static void min2(int n, int count) {  //min1 fonksiyonunun tam tersi 0 dan ona kadar toplama işlemi yapacak
        if (count >= n) {
            System.out.print(n + " ");
            min2(n + 5, count);
        }
    }
}
