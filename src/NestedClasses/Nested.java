package NestedClasses;

public class Nested {
    private String outerField = "Something";

    public class Inner{
        public void display(){
            System.out.println(outerField);
        }
    }
}
