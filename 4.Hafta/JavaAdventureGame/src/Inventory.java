public class Inventory {
    private boolean water,food,wood;
    private Weapon weapon;
    private Armor armor;
    public Inventory(){
        this.water=false;
        this.food=false;
        this.wood=false;
        this.weapon=new Weapon("yumruk",0,0,0);
        this.armor=new Armor(0,"Paçavra",0,0);
    }
      public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isWood() {
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }
}
