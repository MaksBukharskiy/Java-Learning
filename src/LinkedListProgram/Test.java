package LinkedListProgram;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Mango");
        list.addFirst("Banana");
        list.addLast("Kiwi");

        list.removeLast();
        list.removeFirst();

        list.getFirst();
        list.getLast();

        System.out.println(list);

        for(String fruit : list){
            System.out.println(fruit);
        }
    }
}
