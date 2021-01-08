import java.util.Scanner;

public class calcMain {
    public static void main(String[] args) {
        while (true)
        checkOption();
    }

        public static void checkOption() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Selection the option from 1 to 4");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int option = sc.nextInt();
            if(option >= 6) {
                System.out.println("invalid option entered....try again");
                System.exit(0);
            }
            if(option == 5) {
                System.out.println("user cancelled the operation.....");
                System.exit(0);
            }

            System.out.println("enter the first number");
            double first = sc.nextInt();
            System.out.println("enter the second number");
            double second = sc.nextInt();
            System.out.println();

            myCalc cc = new myCalc(first, second);

            switch (option) {
                case 1 -> cc.getAdditionResult();
                case 2 -> cc.getSubtractionResult();
                case 3 -> cc.getMultiplicationResult();
                case 4 -> cc.getDivisionResult();
            }
        }

    }


