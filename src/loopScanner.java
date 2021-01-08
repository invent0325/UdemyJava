import java.util.Scanner;

public class loopScanner {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myIntegers = getIntegers(3);
        for(int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }
        return values;
    }
}
