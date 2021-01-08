public class mainPs4 {

    public static void main(String[] args) {
        ps4Features ps = new ps4Features("400 GB");
        Controller controller = new Controller(10, ps);

        System.out.println(controller);
        System.out.println(ps);

    }
}
