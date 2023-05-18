import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişken tanımlandı
        int sayi=0;
        //Scanner sınıfından nesne türetildi
        Scanner inp = new Scanner(System.in);
        //Kullanıcıya text gösterildi
        System.out.print("Bir sayı girin : ");
        //Kullanıcıdan bir sayı alındı
        sayi=inp.nextInt();
        //Kullanıcının girdiği rakam ile döngü kuruldu
        for (int i=0; i<=sayi; i++){
           //döngü çalışırken i değişkeni çift sayı olunca döngü başa atladı
            if (i%2!=0){
                continue;
            }
            //koşul false olunca aşağıdaki kod çalıştı ve çift sayılar ekrana yazıldı
            System.out.print(i+",");
        }
    }
}