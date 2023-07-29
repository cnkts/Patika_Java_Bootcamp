import java.util.Random;

public abstract class BattleLoc extends Location{
    Random random = new Random();
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    private Player player;
    public BattleLoc(Player player, String name,Obstacle obstacle,String award,int maxObstacle) {
        super(player, name);
        this.obstacle=obstacle;
        this.award=award;
        this.maxObstacle=maxObstacle;
    }
    @Override
    boolean onLocation() {
        int obsNumber=this.RandomObstacleNumber();
        System.out.println("Şuan Buradasınzı : "+ this.getName());
        System.out.println("Dikkatli Ol Burada : "+obsNumber+ " tane "+ this.getObstacle().getName()+ " yaşıyor");
        System.out.println("<S>avaş ya da <K>aç");
        String selectCase=scanner.nextLine().toUpperCase();
        if (selectCase.equals("S")){
        if(combat(obsNumber)){
            System.out.println(this.getName()+" bölgesindeki tüm düşmanları yendiniz!");
            if(this.award.equals("food") && this.getPlayer().getInventory().isFood()==false){
                System.out.println(this.award+" kazandınız !!!");
                getPlayer().getInventory().setFood(true);
            }else if(this.award.equals("water") && this.getPlayer().getInventory().isWater()==false){
                System.out.println(this.award+" kazandınız !!!");
                getPlayer().getInventory().setWater(true);
            }else if(this.award.equals("wood") && this.getPlayer().getInventory().isWood()==false){
                System.out.println(this.award+" kazandınız !!!");
                getPlayer().getInventory().setWood(true);
            }
            return true;
            }
        }
        if(this.getPlayer().getHealth()<=0){
            System.out.println("Öldünüz !!!!!!!!");
            return false;
        }
        return true;
    }
    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOrjHealth());
            playerStatus();
            obstacleStatus(i);
            while (this.getPlayer().getHealth()>0 && this.getObstacle().getHealth()>0){

                System.out.println("<V>ur veya <k>aç");
                String selectCombat=scanner.nextLine().toUpperCase();

                if(selectCombat.equals("V")){
                    int firstKick = random.nextInt(2);

                    if (firstKick == 0){
                        System.out.println("Siz Vurdunuz");
                        this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getTotalDemage());
                        afterhit();
                    }else{
                        if(this.getObstacle().getHealth()>0){
                            System.out.println();
                            System.out.println("Canavar Size Vurdu !");
                            int obstacleDemage= this.getObstacle().getDemage()-this.getPlayer().getInventory().getArmor().getBlock();
                            if(obstacleDemage<0)obstacleDemage=0;
                            this.getPlayer().setHealth(this.getPlayer().getHealth()-obstacleDemage);
                            afterhit();
                        }
                    }

                }else{
                    return false;
                }
            }
            if(this.getObstacle().getHealth()<this.getPlayer().getHealth()){
                System.out.println("Düşmanı Yendiniz!!!");
                System.out.println(this.getObstacle().getAward()+" para kazandınız!!!!!");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getObstacle().getAward());
            }
        }
        return true;
    }

    private void afterhit() {
        System.out.println("Canınız : "+this.getPlayer().getHealth());
        System.out.println("Canavarın Canı : "+this.getObstacle().getHealth());
        System.out.println();
    }

    private void obstacleStatus(int i) {
        System.out.println(i+"."+"Canavar Değerleri");
        System.out.println("---------------------------------");
        System.out.println("Sağlık : " + this.getObstacle().getHealth());
        System.out.println("Hasar : " + this.getObstacle().getDemage());
        System.out.println("Ödül : " + this.getObstacle().getAward());
    }

    private void playerStatus() {
        System.out.println("Oyuncu Değerleri");
        System.out.println("---------------------------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth());
        System.out.println("Silah : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar : " + this.getPlayer().getTotalDemage());
        System.out.println("Zırh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para : " + this.getPlayer().getMoney());
        System.out.println();
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public int RandomObstacleNumber(){
        Random r =new Random();
        return r.nextInt(this.getMaxObstacle())+1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
