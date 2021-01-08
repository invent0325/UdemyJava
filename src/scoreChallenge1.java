public class scoreChallenge1 {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        dislayHighScorePosition("Tim", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        dislayHighScorePosition("Bob", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        dislayHighScorePosition("Percy", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        dislayHighScorePosition("Gilbert", highScorePosition);
        highScorePosition = calculateHighScorePosition(1000);
        dislayHighScorePosition("Louis", highScorePosition);
    }

    public static void dislayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if(playerScore >= 1000) {
            position = 1;
        }
        else if(playerScore >= 500) {
            position = 2;
        }
        else if(playerScore >= 100) {
            position = 3;
        }
            return position;
    }
}
