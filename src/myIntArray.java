public class myIntArray {
    public static void main(String[] args) {

        int[] myIntArrayValue = new int[10];
        int[] myIntAnotheArray = {1, 2, 3, 4, 5};
        double[] myDoubleArrayValue = new double[10];
        int[] myForArrayLoop = new int[10];

        myIntArrayValue[5] = 50;
        for(int i = 0; i < 10; i++) {
            myForArrayLoop[i] = i * 10;
        }

        System.out.println(myIntArrayValue[5]);
        System.out.println(myIntAnotheArray[1]);
        System.out.println(myForArrayLoop[2]);
    }
}
