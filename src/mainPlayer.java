public class mainPlayer {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.fullName = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 21;
//        player.looseHealth(damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
