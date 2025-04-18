// Файл: CarMain.java
package NestedClasses;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Porsche 911"); // Исправлено написание "Porshe" на "Porsche"
        Car.Engine engine = car.new Engine(300); // Изменено имя переменной на "engine"
        engine.displayInfo(); // Добавлены круглые скобки для вызова метода
    }
}

