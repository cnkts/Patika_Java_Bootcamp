
package Palindrom_Sayilar;
import java.util.Scanner;
/**
 *
 * @author Can Aktas
 */
public class Palindrom_Sayilar {

    public static void main(String[] args) {
        //Scanner sınıfından "scanner" nesnesi türetildi
        Scanner scanner = new Scanner(System.in);
        //Kullanıcıdan bir sayı girmesi istendi
        System.out.print("Lütfen bir sayı giriniz: ");
        //Kullanıcının girdiği değer number değişkenine atandı
        int number = scanner.nextInt();
        //isPalindrom metodu çağrıldı
        isPalindrom(number);

        //ispalindrom metodundan gelen true/false değere göre sonuç ekrana yazdırıldı
        if (isPalindrom(number)) {
            System.out.println("It is a palindrom number");
        }else {
            System.out.println("It is not a palindrom number");
        }
    }

    static boolean isPalindrom(int number){
        //Değişkenler tanımlandı
        int temp = number, inverse = 0, x;
        //Değişken 0'a eşit olmadığı sürece çalışacak döngü oluşturuldu ve palindrom kontrolu yapıldı
        while (temp != 0) {
            x= temp%10;
            inverse = (inverse*10)+x;
            temp/=10;
        }
        //kullanıcının girdiği sayı ile ters çevrilen sayı eşitmi/değil mi bakıldı ve sonuç true/false döndrüldü
        return number == inverse;
    }
}