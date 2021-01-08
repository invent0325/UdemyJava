public class vipCustomerMain {
    public static void main(String[] args) {

        vipCustomer john = new vipCustomer();
        System.out.println(john.getVipName());

        vipCustomer mark = new vipCustomer("Mark", 10000);
        System.out.println(mark.getVipName());

        vipCustomer bob = new vipCustomer("bob", 25000, "Bob@email.com");
        System.out.println(bob.getVipName());
    }
}
