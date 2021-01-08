public class myVariables {
    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        int bustedMaxValue = myMaxIntValue + 1;

        System.out.println("Integer Minimum Value : " + myMinIntValue);
        System.out.println("Integer Maximum Value : " + myMaxIntValue);
        System.out.println("Busted Max Value : " + bustedMaxValue);
        System.out.println("Busted Min Value : " + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value : " + myMinByteValue);
        System.out.println("Byte Maximum Value : " + myMaxByteValue);

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value : " + myMinShortValue);
        System.out.println("Short Maximum Value : " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("long Minimum Value : " + myMinlongValue);
        System.out.println("long Maximum Value : " + myMaxlongValue);

        long myLongLiteral = 2147483647;
        System.out.println(myLongLiteral);
    }
}
