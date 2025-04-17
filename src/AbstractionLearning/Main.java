package AbstractionLearning;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 8);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimetr: " + circle.perimetr());

        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle 1perimeter: " + rectangle.perimetr());
    }
}
