public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    boolean onLocation() {
        System.out.println("Mağazaya Hoş Geldiniz");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1) Silahlar");
            System.out.println("2) Zırhlar");
            System.out.println("3) Çıkış Yap");
            System.out.println("Seçiminiz : ");
            int selectCase = scanner.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Geçersiz bir değer girdiniz. Tekrar deneyiniz.");
            }
            switch (selectCase) {

                case 1:
                    printWeapon();
                    buyWeapon();
                    break;

                case 2:
                    printArmor();
                    buyArmor();
                    break;

                case 3:
                    System.out.println("Birdaha Bekleriz");

                    showMenu = false;
                    break;
            }
        }
        return true;
    }
    //Silahları Ekrana Yazdır
    private void printWeapon() {
        System.out.println("------Silahlar--------");
        System.out.println("");
        //Silahları Listele
        for (Weapon w : Weapon.weapons() ){
            System.out.println(w.getId()+"-"+w.getName()+" <Para : "+w.getPrice()+" , Hasar : "+ w.getDemage()+" >");
        }
    }

    public void buyWeapon(){
        System.out.print("Bir Silah Seçin : ");
        int selectweapon=scanner.nextInt();
        while (selectweapon<1 || selectweapon>Weapon.weapons().length){
            System.out.println("Geçersiz bir değer girdiniz lütfen tekrar deneyin");
            selectweapon=scanner.nextInt();
        }
        Weapon selectedwWeapon=Weapon.getWeaponObjById(selectweapon);
        if (selectedwWeapon!=null){
            if (selectedwWeapon.getPrice()>this.getPlayer().getMoney()){
                System.out.println("Yeterli paranız bulnmamaktadır.");

            }else{
                //Satın alma işlemi
                System.out.println(selectedwWeapon.getName()+"silahını satın aldınız");
                int balance=this.getPlayer().getMoney()- selectedwWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan Bakiye : "+this.getPlayer().getMoney());

                System.out.println("Önceki Silahınız : "+ this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setWeapon(selectedwWeapon);
                System.out.println("Yeni Silahınız : "+ this.getPlayer().getInventory().getWeapon().getName());

            }

        }
    }
    //Zırhları Ekrana Yazdır
    private void printArmor() {
        System.out.println("------Zırhlar--------");
        System.out.println("");
        for(Armor a : Armor.armors()){
            System.out.println(a.getId()+"-"+a.getName()+ "< Para : " + a.getPrice()+" , Zırh : "+ a.getBlock()+"");

        }
    }
    private void buyArmor() {
        System.out.print("Bir Zırh Seçin : ");
        int selectArmorId=scanner.nextInt();
        while (selectArmorId <1 || selectArmorId> Armor.armors().length){
            System.out.println("Geçersiz bir değer girdiniz. Lütfen tekrar deneyin");
            selectArmorId=scanner.nextInt();
        }
        Armor SelectedArmor= Armor.getArmorObjById(selectArmorId);
        if (SelectedArmor !=null){
            if (SelectedArmor.getPrice()>this.getPlayer().getMoney()){
                System.out.println("Yeterli paranız bulnmamaktadır.");
            }else{
                //Satın alma işlemi
                System.out.println(SelectedArmor.getName()+" Zırhı satın aldınız");
                int balance=this.getPlayer().getMoney()- SelectedArmor.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan Bakiye : "+this.getPlayer().getMoney());
                System.out.println("Önceki Zırhınız : "+ this.getPlayer().getInventory().getArmor().getName());
                this.getPlayer().getInventory().setArmor(SelectedArmor);
                System.out.println("Yeni Zırhınız : "+ this.getPlayer().getInventory().getArmor().getName());

            }
        }
    }

}
