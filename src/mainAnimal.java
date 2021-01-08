public class mainAnimal {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        dogAnimal dog = new dogAnimal("Buzz", 8, 20, 2, 4, 1, 20, "Long Silky");

        //dog.eat();
        dog.walk();
        //dog.run();
    }
}
