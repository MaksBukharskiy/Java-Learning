package AreaRecord;

public class Test {
    public static void main(String[] args){
        AreaCounting total = new AreaCounting(12.9, 34.6);
        System.out.println("Your first answer is (" + total.area() + ")");
        System.out.println("Your second answer is (" + total.info() + ")");
    }
}
