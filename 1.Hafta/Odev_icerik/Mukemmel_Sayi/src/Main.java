import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int sayi=scanner.nextInt();
        int toplam=0;
            // Girilen değer bir ve birden küçükse mükemmel sayı değildir.
        if(sayi<=1){
            //Sayı bire eşitse ya da birden küçükse mükkemmel sayı değildir.
            System.out.println(sayi+" Mukemmel sayi degildir");
            //Bir mükemmel sayı değilse aşaiıdaki kodlar yürütülmeden program sonlandırıldı
            System.exit(0);
        }else{
            //Sayıyı tam bölen pozitif sayılar bulunuyor
            for (int i=1;i<sayi;i++){
                if(sayi%i==0){
                    toplam+=i;
                }
            }
        }
        //Pozitif tam bölen sayıların toplamı, girilen sayıyı tam bölüyorsa mükemmel sayı, bölmüyorsa mükemmel sayı değil
        if(sayi==toplam){
            System.out.println(sayi+" Mukemmel sayidir");
        }else{
            System.out.println(sayi+" Mukemmel sayi degildir");
        }
    }
}