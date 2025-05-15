package ArraysListLearning;

import java.util.ArrayList;

public class SecondTest {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(51);
        list.add(50);
        list.add(49);

        list.remove(0);
        list.set(1, 555);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
