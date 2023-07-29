public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli Evdesiniz \b Canınız Yenilendi");
        //Burata item kontrolü yapacaksın. Eğer itemler tamamsa oyun oyun kazanılacak.
        return true;
    }
}
