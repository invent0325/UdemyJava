public class moreMethods {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 50);
        System.out.println("New Score is " + newScore);
        int result = calculateScore(75);
        System.out.println("Un-Named player has " + result);
        System.out.println(calculateScore());
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 100;
    }

    public static int calculateScore(int score) {
        System.out.println("Un-named player scored " + score + " points");
        return score * 100;
    }

    public static int calculateScore() {
        System.out.println("No player name, no score available");
        return 0;
    }
}
