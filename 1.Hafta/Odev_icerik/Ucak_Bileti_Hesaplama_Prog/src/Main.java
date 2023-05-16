import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler tanımlandı
        Short age,ftype;
        Double distance, price=0.10;
        Scanner input = new Scanner(System.in);


        //Kullanıcıdan bilgiler alınıyor
        System.out.print("Mesafe Bilgisi Girin (km) : ");
        distance=input.nextDouble();

        System.out.print("Kaç yaşındasınız : ");
        age=input.nextShort();

        System.out.println("Seyehat Türünüzü Seçin\n1: Tek yön bilet\n2: Gidiş-dönüş bilet ");
        ftype=input.nextShort();
        // yaş,mesafe ve seyahat türü kontrolü yapılıyor.Eğer şartlar sağlanıyorsa ücret hesaplanıyor
        if (distance > 0 && age > 0 && (ftype == 1 || ftype == 2)) {
            price = 0.10 * distance;
            if (age < 12) {
                price *= 0.5;
            } else if (age < 25) {
                price *= 0.9;
            } else if (age > 65) {
                price *= 0.7;
            }
            if(ftype == 2){
                price *= 0.8;
                price *= 2;
            }
            System.out.println("Total Price: " + price + " TL");
        } else {
            System.out.println("Wrong Data!");
        }
    }
}