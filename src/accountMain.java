public class accountMain {
    public static void main(String[] args) {

        Account bobsAccount = new Account();
        //Account bobsAccount = new Account("12345", 0.00, "Bob", "bob@gmail.com", "(892)-123-4567");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.withdrawal(100);
        bobsAccount.deposit(50);
        bobsAccount.withdrawal(100);

        bobsAccount.deposit(51);
        bobsAccount.withdrawal(100);

        Account timsAccount = new Account("Tim", "tim@email.com", "(323)-212-121");
        System.out.println("Name : " + timsAccount.getCustomerName());
        System.out.println("Email Address :  " + timsAccount.getCustomerEmailAddress());
    }
}
