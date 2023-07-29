import javax.xml.stream.events.StartDocument;
import java.security.PublicKey;
import java.util.Scanner;
public class Game {
 private Scanner scanner=new Scanner(System.in);
 private String Name;
    public void Start(){
        System.out.print(".");System.out.print(".");System.out.print(".");System.out.print(".");
        System.out.print("Bana ismini söyle yabancı : ");
        Name= scanner.next();
        Player player=new Player(Name);
        //Greeting Message
        System.out.println("Merhaba "+player.getName()+". Macera Oyununa Hoş Geldin. Ben Javalin. Bu serüvende sana rehberlik"+
                " edeceğim.\b ilk olarak aşağıdaki listeden kendine bir savaşçı seçmen gerek. Hadi yap seçimini!");
        //Selecting Characther
        player.selectChar();

        //Selecting Location
        Location location=null;
        while(true){
            //Write Player Info to Screen
            player.printInfo();
            System.out.print("");
            System.out.println("********** Bölgeler **********");
            System.out.print("");
            System.out.println("1 - Güvenli Ev-->Burada Düşman Yok");
            System.out.println("2 - Eşya Dükkanı --> Silah veya Zırh Satın Alabilirsin");
            System.out.println("3 - Mağara --> Ödül <Yemek> Dikkatli Ol Zombi Çıkabilir !");
            System.out.println("4 - Orman --> Ödül <Odun> Dikkatli Ol Vampir Çıkabilir !");
            System.out.println("5 - Nehir -->Ödül <Su> Dikkatli Ol Ayı Çıkabilir !");
            System.out.println("0 - Çıkış --> Oyunu Sonladır ");
            System.out.print("Gitmek İstediğiniz Bölgeyi Seçiniz : ");
            int selectlocation=scanner.nextInt();
            switch (selectlocation){
                case 0 :
                    location=null;
                    break;
                case 1 :
                    location=new SafeHouse(player);
                    break;

                case 2 :
                    location=new ToolStore(player);
                    break;

                case 3 :
                    if(player.getInventory().isFood()){
                        System.out.println("Mağara etabını daha önce geçtin ve \"Yemek\" ödülünü kazandın. Diğer mekanları denemelisin");
                        continue;
                    }
                    location=new Cave(player);
                    break;

                case 4 :
                    if(player.getInventory().isWood()){
                        System.out.println("Orman etabını daha önce geçtin ve \"Odun\" ödülünü kazandın. Diğer mekanları denemelisin");
                        continue;
                    }
                    location=new Forest(player);
                    break;


                case 5 :
                    if(player.getInventory().isWater()){
                        System.out.println("Nehir etabını daha önce geçtin ve \"Su\" ödülünü kazandın. Diğer mekanları denemelisin");
                        continue;
                    }
                    location=new River(player);
                    break;

                default: System.out.println("Lütfen Geçerli Bir Değer Girin!");

            }

            if(location.getClass().getName().equals("SafeHouse")){
                if(player.getInventory().isWood()&&player.getInventory().isWater()&&player.getInventory().isFood()){
                    System.out.println("Tebrikler Oyunu Kazandın!!!!!");
                    break;
                }

            }

            if(location==null){
                System.out.println("Oyun Bitti Görüşmek Üzere");
                break;
            }
            if(!location.onLocation()){

                System.out.println("GAME OVER!");
                break;
            }
        }
    }
}