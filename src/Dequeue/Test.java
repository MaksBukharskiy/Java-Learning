package Dequeue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        Deque <Integer> age = new LinkedList<>();
        age.offer(1);
        age.add(2);

        age.remove(1);
        age.offer(3);

        age.addFirst(123);
        age.addLast(123);

        age.removeFirst();
        age.removeLast();

        age.addFirst(123);
        age.addLast(123);

        System.out.println(age);
    }
}
