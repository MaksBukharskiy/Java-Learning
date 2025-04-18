// Файл: Car.java
package NestedClasses;

public class Car {
    private String model;

    // Конструктор с параметром
    public Car(String model) {
        this.model = model;
    }

    // Вложенный класс
    public class Engine {
        private int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        public void displayInfo() {
            System.out.println("Car model: " + model);
            System.out.println("Car horsepower: " + horsepower);
        }
    }
}
