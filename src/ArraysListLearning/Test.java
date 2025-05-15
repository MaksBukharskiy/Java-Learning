package ArraysListLearning;
import java.util.ArrayList;

public class Test  {
    public static void main(String[] args) {
        ArrayList <Integer> newList = new ArrayList<>();
        newList.add(89);
        newList.add(1, 88); //добавление с массив элемента
        System.out.println(newList);

        newList.set(1, 999); //изменение элемента

        System.out.println(newList.get(1)); //доступ к элементу

        newList.remove(0); //удаление элемента
        newList.remove(0);
        System.out.println(newList);

    }
}
