import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler tanımlandı
        int for_count;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        //Scanner sınıfından bir nesne türetildi
        Scanner scanner=new Scanner(System.in);
        //Kullanıcıya kaç sayı gireceği soruldu
        System.out.print("Kaç tane sayı gireceksiniz: ");
        //Kullanıcının girdiği değer count değişkenine atandı
        int count =scanner.nextInt();
        //değişkende tutulan değer ile for döngüsü oluşturuldu
        for(int i=1; i<=count; i++){
            System.out.print(i+". Sayıyı Giriniz : ");
            for_count=scanner.nextInt();
            //girilen değerlerden en büyük ve en küçük sayılar içim kontorl oluşturuldu
            if(for_count>max) max=for_count;
            else if(for_count<min) min=for_count;
        }
        //sonuçlar ekrana yazdırıldı
        System.out.println("en büyük değer: "+max);
        System.out.println("en küçük değer: "+min);
    }

}



