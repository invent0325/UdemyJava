public class myIntArray {
    public static void main(String[] args) {

        int[] myForArrayLoop = new int[25];
        printArray(myForArrayLoop);
        }

        public static void printArray(int[] array) {
            for(int i = 0; i < array.length; i++) {
                array[i] = i * 10;
                System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
