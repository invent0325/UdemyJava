public class switchStatement {
    public static void main(String[] args) {

        int switchValue = 14;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3 -> System.out.println("Value was 3");
            case 4 -> System.out.println("Value was 4");
            default -> System.out.println("Value was more than 4 that is " + switchValue);
        }
        System.out.println("Switch loop completed");
    }


}
