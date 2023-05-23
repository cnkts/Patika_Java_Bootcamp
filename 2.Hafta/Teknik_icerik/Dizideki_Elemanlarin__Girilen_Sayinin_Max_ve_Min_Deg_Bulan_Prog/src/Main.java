import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Dizi değişkeni tanımlandı
        int[] list = {0, 15, 32, -5, 65, -22};
        System.out.println("Mevcut Dizi : " + Arrays.toString(list));
        //Scanner sınıfından scanner nesnesi türetildi
        Scanner scanner = new Scanner(System.in);
        //Kullanıcıdan bir sayı istendi
        System.out.print("Bir sayı giriniz : ");
        //Kullanıcının girdiği sayı değişkene atandı
        int number = scanner.nextInt();
        //Kullanıcının girdiği sayı ekrana yazdırıldı
        System.out.println("Girilen Sayı : "+number);
        //For döngüsüyle kullanıcının girdiği sayı dizi içerisindeki sayılarla karşılaştırıldı.
        for(int i= 0; i < list.length; i++){
            //listenin sıfırıncı elemanından başlayarak tek tek girilen sayı elemanlardan büyük mü küçük mü bakıldı
            if(number > list[i] && number < list[i+1]){
                System.out.println("Girilen sayıdan küçük en yakın sayı : " + list[i]);
                System.out.println("Girilen sayıdan büyük en yakın sayı : " + list[i+1]);
                break;
            }
        }
    }
}