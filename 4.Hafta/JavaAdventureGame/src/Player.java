import java.util.Scanner;

public class Player {
    private int Demage;
    private int Health;
    private int Money;
    private String CharName;
    private String Name;
    private Inventory inventory;

    public Player(String name){
        this.Name=name;
        this.inventory=new Inventory();
    };
    public int getTotalDemage(){
        return Demage + this.getInventory().getWeapon().getDemage();
    }

    public int getDemage() {
        return Demage;
    }
    private Scanner scanner = new Scanner(System.in);

    public void selectChar(){
        System.out.println("********** Karakter Listesi **********");
        GameChar[] charList={new Samurai(),new Archer(),new Knight()};
        for (GameChar GameChar : charList) {
            System.out.println(GameChar.getId()+")\t Karakter : "+ GameChar.getName()+" \t Hasar : "+GameChar.getDemage()+ "\t Sağlık : "+GameChar.getHealth()+"\t Para : "+GameChar.getMoney()+"");
        }
        System.out.println("----------------------------------------------------------------------");
        int select;
        select= scanner.nextInt();
        switch (select){

            case (1):
                 initPlayer(new Samurai());

                break;

            case (2):
                initPlayer(new Archer());
                break;

            case (3):
                initPlayer(new Knight() );
                break;

            default: System.out.println("1 ile 3 arasunda bir seçim yapınız");
        }
        System.out.println("Seçtiğiniz Karakter : "+this.getCharName());

    }
    public void initPlayer(GameChar gameChar){
        this.setDemage(gameChar.getDemage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    public void printInfo(){
        System.out.println("Silah : "+ this.getInventory().getWeapon().getName() +
                        " , Zırh : "+ this.getInventory().getArmor().getName() +
                        " , Bloklama : " + this.getInventory().getArmor().getBlock() +
                        " , Hasar : "+this.getDemage()+
                " , Sağlık : "+this.getHealth()+
                " , Para : "+this.getMoney()
                );
    }
    public void setDemage(int demage) {
        Demage = demage;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public String getCharName() {
        return CharName;
    }

    public void setCharName(String charName) {
        CharName = charName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
