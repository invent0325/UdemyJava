public class EnhancedPlayer {

    private final String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if(health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void looseHealth(int damage) {
        this.hitPoints -= damage;
        if(this.hitPoints <= 0 ) {
            System.out.println(name + " has got knocked out");
            //reduce number of lives remaining of the player
        }
    }

    public int healthRemaining() {
        return this.hitPoints;
    }

    public int getHealth() {
        return hitPoints;
    }
}
