import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class minChallenge {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter counter");
        int counter = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(counter);

        int returnedMin = findMin(returnedArray);
        int returnedMax = findMax(returnedArray);
        int returnedSum = findSum(returnedArray);

        System.out.println("Min = " + returnedMin);
        System.out.println("Max = " + returnedMax);
        System.out.println("Total = " + returnedSum);
    }

    private static int findSum(int[] array) {
        for(int value : array) {
            AtomicInteger myTotal = new AtomicInteger(Integer.sum(array[value], value));
            return myTotal.get();
        }
        return 0;
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter a number : ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    private static int findMax(int[] array) {

        int max = Integer.MAX_VALUE;
        for(int value : array ) {
            max = value;
        }
        return max;
    }
}
