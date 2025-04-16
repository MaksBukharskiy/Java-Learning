package PolymorphysmProgram;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Just animal", 100);
        Dog dog = new Dog("Kevin", 16, "Pitbull");

        animal.displayInfo();
        dog.displayInfo();
        }
    }