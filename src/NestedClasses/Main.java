package NestedClasses;

public class Main {
    public static void main(String[] args) {
        Nested outer = new Nested();
        Nested.Inner inner = outer.new Inner();

        inner.display();
    }
}
