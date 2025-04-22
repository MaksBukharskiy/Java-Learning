package EnumLearning;

public class Test {
    public static void main(String[] args){
        Season season = Season.SUMMER;

        switch(season){
            case SUMMER:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's cold outside");
                break;
        }
    }
}
