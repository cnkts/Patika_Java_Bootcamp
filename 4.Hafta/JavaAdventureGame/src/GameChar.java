public abstract class GameChar {

    private int id;
    private int demage;
    private int money;
    private int health;
    private String name;

    public GameChar(int id, int demage, int money, int health,String name) {
        this.id=id;
        this.demage = demage;
        this.money = money;
        this.health = health;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDemage() {
        return demage;
    }

    public void setDemage(int demage) {
        this.demage = demage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
