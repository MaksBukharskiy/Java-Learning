package Polymorphysm;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Ссылка типа Animal указывает на объект Dog
        Animal myCat = new Cat(); // Ссылка типа Animal указывает на объект Cat

        myDog.makeSound();
        myCat.makeSound();
    }
}

