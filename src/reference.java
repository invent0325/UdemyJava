import java.util.Arrays;

public class reference {
    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        //System.out.println("Original Value = " + myIntValue);
        //System.out.println("Copied Value = " + anotherIntValue);

        anotherIntValue++;
        //System.out.println("Original Value = " + myIntValue);
        //System.out.println("Copied Value = " + anotherIntValue);

        int[] myIntArray = new int[5]; //
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        myIntArray[0] = 1;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4, 5, 6, 7, 8};
        modifyArrays(myIntArray);

        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));
    }

    public static void modifyArrays(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
