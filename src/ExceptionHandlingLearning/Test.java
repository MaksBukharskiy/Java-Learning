package ExceptionHandlingLearning;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        String str = null;

        try{
            System.out.println(str.length());
        }

        catch(NullPointerException e){
            System.out.println("Ошибка, попытка вызвать на null объекте");
        }
    }
}
