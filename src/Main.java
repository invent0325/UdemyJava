public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex");
        Dog fluffy = new Dog("Fluffy");

        rex.printName();
        fluffy.printName();

    }

    public static class Dog {
        private final String name;

        public Dog(String name) {
            this.name = name;
        }

        public void printName() {
            System.out.println("name = " + name);
        }
    }
}
