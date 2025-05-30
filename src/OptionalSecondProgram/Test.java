package OptionalSecondProgram;
import java.util.Optional;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");

        String input;
        input = sc.nextLine();

        Optional<Integer> age = Optional.ofNullable(input.isEmpty() ? null : input)
                .filter(s -> s.matches("\\d+"))
                .map(Integer::parseInt)
                .filter(a -> a >= 18);

        age.ifPresentOrElse(
                a -> System.out.println("Доступ разрешен для возраста: " + a),
                () -> System.out.println("Неверный ввод или возраст меньше 18")
        );

    }
}
