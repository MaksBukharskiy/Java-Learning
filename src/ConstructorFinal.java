public class ConstructorFinal {
    public static void main(String[] args) {
        Tesla myTesla = new Tesla("Red", 200);
        myTesla.display();
    }

    public static class Tesla{
        String color;
        int speed;

        public Tesla(String color, int speed) {
            this.color = color;
            this.speed = speed;
        }

        public void display(){
            System.out.println("Tesla's color is " + color);
            System.out.println("Tesla's speed is " + speed);
        }
    }


}
