package Names;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = sc.nextLine();

        try{
            NamesValidator.validateName(name);
            System.out.println("Ваше имя успешно добавлено");
        }

        catch (NameCheckException e){
            System.out.println("Ваше имя не добавлено");
        }
    }
}
