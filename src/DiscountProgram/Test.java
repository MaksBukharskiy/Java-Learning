package DiscountProgram;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Введите цену товара: ");
            double price = Double.parseDouble(sc.nextLine());

            System.out.print("Введите возраст покупателя: ");
            int age = sc.nextInt();

            System.out.print("Тип скидки (1 - студенческая, 2 - пенсионерская): ");
            int discountType = sc.nextInt();

            DiscountChecking calculator;

            if (discountType == 1) {
                calculator = (p, a) -> {
                    if (a < 16 || a > 25)
                        throw new InvalidDiscountEcxeption("Студенческая скидка только для 16-25 лет");
                    return p * 0.8; // 20% скидка
                };
            } else if (discountType == 2) {
                calculator = (p, a) -> {
                    if (a < 60)
                        throw new InvalidDiscountEcxeption("Пенсионерская скидка только от 60 лет");
                    return p * 0.75; // 25% скидка
                };
            } else {
                throw new InvalidDiscountEcxeption("Неверный тип скидки");
            }

            double finalPrice = calculator.calculate(price, age);
        }

            catch (NumberFormatException e) {
                System.out.println("Ошибка: Введены некорректные числовые данные");
            } catch (InvalidDiscountEcxeption e) {
                System.out.println("Ошибка скидки: " + e.getMessage());
            } finally {
                sc.close();
            }

    }
}
