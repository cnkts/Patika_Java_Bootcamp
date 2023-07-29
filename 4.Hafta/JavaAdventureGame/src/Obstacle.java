public class Obstacle {
    private int id;
    private String name;
    private int demage;
    private int health;
    private int orjHealth;
    private int award;

    public Obstacle(int id, String name, int demage, int health,int award,int orjHealth) {
        this.id = id;
        this.name = name;
        this.demage = demage;
        this.health = health;
        this.award=award;
        this.orjHealth = orjHealth;
    }

    public int getOrjHealth() {
        return orjHealth;
    }

    public void setOrjHealth(int orjHealth) {
        this.orjHealth = orjHealth;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDemage() {
        return demage;
    }

    public void setDemage(int demage) {
        this.demage = demage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health<0){health=0;}
        this.health = health;
    }
}
