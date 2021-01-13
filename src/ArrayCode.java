public class ArrayCode {
    public static void main(String[] args) {

        int[] myIntArray = new int[11];

        for(int i = 1; i < myIntArray.length; i++) {
            for(int j = 1; j < 11; j++) {
                int constantValue = 2;
                myIntArray[i] = i * j;
                System.out.println(i + " * " + j + " = " + myIntArray[i]);
            }
            System.out.println();
        }
    }
}
