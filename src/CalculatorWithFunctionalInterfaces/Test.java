package CalculatorWithFunctionalInterfaces;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Создаем реализацию интерфейсов
        Display consoleDisplay = message -> System.out.println(message);

        InputReader consoleReader = new InputReader() {
            Scanner scanner = new Scanner(System.in);

            public double readNumber() {
                System.out.print("Введите число: ");
                return scanner.nextDouble();
            }

            public int readChoice() {
                System.out.print("Выберите операцию (1-4): ");
                return scanner.nextInt();
            }
        };

        // Определяем математические операции
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> {
            if (b == 0) throw new ArithmeticException("Деление на ноль!");
            return a / b;
        };

        // Основной цикл программы
        while (true) {
            consoleDisplay.show("\n=== Простой калькулятор ===");
            consoleDisplay.show("1. Сложение");
            consoleDisplay.show("2. Вычитание");
            consoleDisplay.show("3. Умножение");
            consoleDisplay.show("4. Деление");
            consoleDisplay.show("5. Выход");

            int choice = consoleReader.readChoice();
            if (choice == 5) break;

            if (choice < 1 || choice > 4) {
                consoleDisplay.show("Неверный выбор!");
                continue;
            }

            try {
                double num1 = consoleReader.readNumber();
                double num2 = consoleReader.readNumber();
                double result = 0;

                switch (choice) {
                    case 1:
                        result = add.calculate(num1, num2);
                        consoleDisplay.show(num1 + " + " + num2 + " = " + result);
                        break;
                    case 2:
                        result = subtract.calculate(num1, num2);
                        consoleDisplay.show(num1 + " - " + num2 + " = " + result);
                        break;
                    case 3:
                        result = multiply.calculate(num1, num2);
                        consoleDisplay.show(num1 + " * " + num2 + " = " + result);
                        break;
                    case 4:
                        result = divide.calculate(num1, num2);
                        consoleDisplay.show(num1 + " / " + num2 + " = " + result);
                        break;
                }
            } catch (ArithmeticException e) {
                consoleDisplay.show("Ошибка: " + e.getMessage());
            } catch (Exception e) {
                consoleDisplay.show("Неверный ввод!");
            }
        }

        consoleDisplay.show("Программа завершена.");
    }
}