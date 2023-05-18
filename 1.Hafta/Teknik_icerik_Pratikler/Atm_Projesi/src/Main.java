import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler tanımlandı
        String userName, password;
        int right,balance,select;
        //Scanner sınıfından bir nesne türetildi
        Scanner input = new Scanner(System.in);
        right = 3;
        balance = 1500;
        //Kullanıcıdan bilgiler istendi
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            // Kullanıcı adı ve parola doğrulama
            if (userName.equals("can") && password.equals("123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                //Bankamatik menü göstermi
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    //switch başlangıç
                    switch (select){
                        //Para Yartırma
                        case 1:{
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            balance += price;}
                        //Para Çekme
                        case 2:{
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                        }
                        //Bakiye Sorgulama
                        case 3:{
                            System.out.println("Bakiyeniz : " + balance);
                        }
                    }
                }
                //Programdan çıkış
                while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            //Kullanıcı adı yada parola hatalı
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}