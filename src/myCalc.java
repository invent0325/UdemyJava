public class myCalc {

    private final double firstNumber;
    private final double secondNumber;

    public myCalc(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public boolean checkNumbers() {
        if(this.firstNumber <= 0 || this.secondNumber <= 0) {
            System.out.println("either num1 or num2 is zero, change the positive and non zero number");
            return true;
        }
        return false;
    }

    public void getAdditionResult() {
        double additionResult = firstNumber + secondNumber;
        System.out.println("Addition Result : " + additionResult);
    }

    public void getSubtractionResult() {
        double minusResult = firstNumber - secondNumber;
        System.out.println("Subtraction Result : " + minusResult);
    }

    public void getMultiplicationResult() {
        double multiplyResult = firstNumber * secondNumber;
        System.out.println("Multiply Result : " + multiplyResult);
    }

    public void getDivisionResult() {
        double divisionResult = firstNumber / secondNumber;
        System.out.println("Multiply Result : " + divisionResult);
    }
}

