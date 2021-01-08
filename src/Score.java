public class Score {
    public static void main(String[] args) {

        int highScore = calculateScore(false, 800, 5, 100);
        System.out.println("Your Final Score is : " + highScore);
        //calculateScore(false, 1000, 3, 50);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        else {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
    }
}
