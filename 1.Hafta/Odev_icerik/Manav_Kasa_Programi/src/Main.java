import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler tanımlandı
        Double Armut,Elma,Domates,Muz,Patlican,tutar;
        Integer MeyveSecim;
        Scanner input =new Scanner(System.in);

        //Değişkenlere değerler atandı
        Armut=2.14;
        Elma=3.67;
        Domates=1.11;
        Muz=0.95;
        Patlican=5.00;

        //Meyve Fiyatları Listelendi
        System.out.println("\nMeyve Kg Fiyatları");
        System.out.println(" 1 :Armut: 2.14 TL \n 2 :Elma : 3.67 TL \n 3 :Domates : 1.11 TL \n 4 :Muz : 0,95 TL \n 5 :Patlıcan : 5.00 TL");

        //Kullanıcıya Listeden Meyve Seçimi Yaptırıldı
        System.out.print("Yukarıdaki listeden meyve seçimi yapın : ");
        MeyveSecim= input.nextInt();

        //Kullanıcıya Kg Bilgisi Yazdırıldı
        System.out.print("Kaç kilo istiyorsunuz : ");
        double miktar=input.nextDouble();

        //Kullanıcı tarafından girilen bilgilere göre fiyat hesaplandı
        switch (MeyveSecim){
            case (1):{
                tutar = miktar*2.14;
                System.out.println("Siparişini toplam : "+tutar+"TL olarak hesaplanmıştır.");
                break;
            }
            case(2):{
                tutar = miktar*3.67;
                System.out.println("Siparişini toplam : "+tutar+"TL olarak hesaplanmıştır.");
                break;
        }
            case (3):{
                tutar = miktar*1.11;
                System.out.println("Siparişini toplam : "+tutar+"TL olarak hesaplanmıştır.");
                break;
            }
            case (4):{
                tutar = miktar*0.95;
                System.out.println("Siparişini toplam : "+tutar+"TL olarak hesaplanmıştır.");
                break;
            }
            case(5):{
                tutar = miktar*5;
                System.out.println("Siparişini toplam : "+tutar+"TL olarak hesaplanmıştır.");
                break;
            }
        }













    }
}