package IteratorLearning;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List <String> list = new LinkedList<>();

        list.add("Maks");
        list.add("Artem");
        list.add("David");

        Iterator <String> iterator = list.iterator();

        while(iterator.hasNext()){
            String names = iterator.next();
            System.out.println(names);

            if(names.equals("David")){
                iterator.remove();
            }
        }

        System.out.println(list);

    }
}
