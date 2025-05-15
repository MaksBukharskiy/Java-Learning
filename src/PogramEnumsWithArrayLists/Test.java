package PogramEnumsWithArrayLists;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<FruitBasket> basket = new ArrayList<>();

        basket.add(FruitBasket.APPLE);
        basket.add(FruitBasket.MANGO);

        for(FruitBasket fruit : basket){
            System.out.println(fruit);
        }
    }
}


