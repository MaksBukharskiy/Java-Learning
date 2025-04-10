import java.util.Scanner;

public class ConnectingConstructorsAndScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the model of your tesla: ");
        String model = scanner.nextLine();

        System.out.print("Enter the color of your tesla: ");
        String color = scanner.nextLine();

        System.out.print("Enter the speed of your tesla: ");
        int speed = scanner.nextInt();

        ScTesla Tesla = new ScTesla(model, color, speed);
        Tesla.totalInfo();

        scanner.close();
    }

    public static class ScTesla {
        String model;
        String color;
        int speed;

        public ScTesla(String model, String color, int speed) {
            this.model = model;
            this.color = color;
            this.speed = speed;
        }

        public void totalInfo() {
            System.out.println("Tesla's model: " + model);
            System.out.println("Tesla's color: " + color);
            System.out.println("Tesla's speed: " + speed);
        }
    }
}
