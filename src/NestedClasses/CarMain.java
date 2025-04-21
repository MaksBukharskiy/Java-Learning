// Файл: CarMain.java
package NestedClasses;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Porsche 911");
        Car.Engine engine = car.new Engine(300);
        engine.displayInfo();
    }
}

