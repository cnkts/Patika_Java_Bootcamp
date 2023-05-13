import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değiskenlen tanımlanıyor
        String UserName,Password,inUserName,inPassword;
        Scanner input=new Scanner(System.in);

        //Standart Kullanıcı adı ve şifre değişkenlere atanıyor
        UserName="can";
        Password="123";

        //Kullanıcı Girisi
        System.out.print("Kullanıcı Adı : ");
        inUserName=input.nextLine();

        System.out.print("Sifrenizi girin : ");
        inPassword=input.nextLine();

        //Kullanıcı adı ve şifre kontrolü
        if(inUserName.equals(UserName) && inPassword.equals(Password)){
            System.out.println("Giriş Başarılı !");
        }else {
            //Kullanıcıya Şifre Sıfırlamak İsteyip İstemediği Soruldu
            System.out.println("Parola ya da Şifre Hatalı ! Şifreni sıfırlamak ister misin? 1: Evet  2: Hayır");
            String choose= input.nextLine();
            //Kullanıcı Şifre Değiştirmek İsterse Çalışacak Kodlar
            if(choose.equals("1")){
                System.out.println("Yeni Şifre : ");
                String yeniSifre=input.nextLine();
               //Yeni Şifre Eski Şifreyle Aynı Mı Kontrol Ediliyor
               if(yeniSifre.equals(Password)){
                   System.out.println("Şifre Oluşturulamadı. Yeni şifre Eski şifre ile aynı olamaz !");
               }else {yeniSifre=Password;
                   System.out.println("Şifre değiştirildi");
               }
            }
        }
    }
}