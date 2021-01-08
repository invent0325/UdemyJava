import static java.lang.System.out;

class javaMethods {
    public static void main(String[] args) {
        int num1 = 11;
        int answer  = multiplyNumbers(num1);
        out.println("The Answer is : " + answer);
    }

    public static int multiplyNumbers(int a) {
        return a * 7;
    }
}
