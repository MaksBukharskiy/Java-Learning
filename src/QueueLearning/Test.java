package QueueLearning;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue <String> queue = new LinkedList<>();

        queue.add("The first");
        queue.add("The second");
        queue.add("The third");

        System.out.println(queue);

        String firstElement = queue.remove();
        System.out.println(firstElement);
        System.out.println(queue);

        String peekElement = queue.peek();
        System.out.println(peekElement);

        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
    }
}
