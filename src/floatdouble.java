public class floatdouble {
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

//        System.out.println("Float Minimum Value : " + myMinFloatValue);
//        System.out.println("Float Maximum Value : " + myMaxFloatValue);

        Double myMinDoubleValue = Double.MIN_VALUE;
        Double myMaxDoubleValue = Double.MAX_VALUE;

//        System.out.println("Double Minimum Value : " + myMinDoubleValue);
//        System.out.println("Double Maximum Value : " + myMaxDoubleValue);

        int i1 = (int) (6f / 3);
        float f1 = 5f / 2;
        double d1 = 5d / 3d;
        System.out.println("Integer : " + i1);
        System.out.println("Float : " + f1);
        System.out.println("Double : " + d1);
    }
}
