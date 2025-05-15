package LinkedListLearning;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList <String> colors = new LinkedList<>();

        colors.add("Something");
        colors.add(1, "Something else");

        colors.remove(1);
        colors.addFirst("hello");
        colors.addLast("slkhgljk");

        System.out.println(colors);
        System.out.println(colors.size());

        colors.removeFirst();
        colors.removeLast();

        System.out.println(colors);
        System.out.println(colors.size());

    }
}
