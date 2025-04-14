package inherritanceLearning;

public class Inherritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        dog.sing();
        dog.bark();

        System.out.println();

        animal.sing();
    }
}
