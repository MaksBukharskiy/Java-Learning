package inherritanceLearning;

public class Inherritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        animal.sing();

        System.out.println();

        dog.sing();
        dog.eat();
        dog.bark();
    }
}
