public class calcConversion {
    public static void main(String[] args) {
        int newResult = calcFeetAndInchesToCentimeters(2, 12);
        System.out.println("Final Result is " + newResult + " Centimeters");
        double newResult1 = calcFeetAndInchesToCentimeters(140);
        System.out.println("Final Result is " + newResult1 + " Feets");
    }

    public static int calcFeetAndInchesToCentimeters(int Feet, int Inches) {
        if (Feet >= 0) {
            if (Inches >= 0 && Inches <= 12) {
                int convertedValues = (int) ((Feet * 30.48) + (Inches * 2.54));
                System.out.println(Feet + " Feet and " + Inches + " Inches in Centimeters is : " + convertedValues );
                return convertedValues;
            } else {
                System.out.println("Condition not met");
                return -1;
            }
        }
        return Feet;
    }

    public static double calcFeetAndInchesToCentimeters(double Inches) {
        if (Inches >= 0) {
           double result = Inches / 12;
            System.out.println(Math.ceil(result));
            return Math.ceil(result);
        }
        else {
            return -1;
        }
    }
}

