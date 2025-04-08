public class Constructors {
        public static void main(String[] args) {
            CarB bugatti = new CarB(200, "yellow");
            System.out.println("Ferrari Spider is " + bugatti.color + " and speed is " + bugatti.speed);
        }
    }

    class CarB {
        int speed;
        String color;

        public CarB(int speed, String color) {
            this.speed = speed;
            this.color = color;
        }
    }
