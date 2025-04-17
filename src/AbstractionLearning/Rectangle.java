package AbstractionLearning;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height; // Площадь прямоугольника
    }

    @Override
    public double perimetr() {
        return 2 * (width + height); // Периметр прямоугольника
    }
}
