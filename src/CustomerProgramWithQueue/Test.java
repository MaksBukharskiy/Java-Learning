package CustomerProgramWithQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue <Customer> queue = new LinkedList<>();

        queue.add(new Customer("Maks", 123));
        queue.add(new Customer("Srefan", 456));
        queue.add(new Customer("Artem", 789));

        while(!queue.isEmpty()){
            System.out.println("Now Serving " + queue.poll());
        }
    }
}
