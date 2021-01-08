public class myIntArray {
    public static void main(String[] args) {

        int[] myForArrayLoop = new int[25];

        for(int i = 0; i < myForArrayLoop.length; i++) {
            myForArrayLoop[i] = i * 10;
            System.out.println("Element " + i + ", value is " + myForArrayLoop[i]);
        }
        System.out.println("For Loop Completed");
    }
}
