package LinkedListProgram;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Mango");

        for(String fruit : list){
            System.out.println(fruit);
        }
    }
}
