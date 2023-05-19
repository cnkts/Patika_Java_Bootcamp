import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Scanner sınıfından bir nesne türedildi
        Scanner scanner=new Scanner(System.in);
        //Ekrana metin yazdırıldı
        System.out.print("Yıl Giriniz : ");
        //Kullanıcının girdiği değer year değişkenine atandı
        int year=scanner.nextInt();
        //if koşulu ile girilen yıl değerinin 4 e tam bölünüp bölünmediğine bakıldı
        if(year%4==0){
        //eğer girilen değer 4 e tam olarak bölünüyorsa
            System.out.print(year+" bir artık yıldır !");
        }else
            //Eğer girilen değer 4 de kalanlı bölünüyorsa
            System.out.print(year+" bir artık yıl değildir !");
    }
}