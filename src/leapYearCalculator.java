public class leapYearCalculator {
    public static void main(String[] args) {

        leapYearsCheck(2021);
    }

    public static void leapYearsCheck(int myYear) {
        boolean isLeapYear = ((myYear % 4 == 0) && (myYear% 100 != 0) || (myYear % 400 == 0));

        if(isLeapYear) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }
}
