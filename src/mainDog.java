public class mainDog {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.bark();
    }

    static class Dog1 {
        public void bark() {
            System.out.println("Woof");
        }
    }
}
