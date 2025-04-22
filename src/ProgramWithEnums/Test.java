package ProgramWithEnums;

public class Test {
    public static void main(String[] args){
        Season season = Season.AUTUMN;

        String totalAutumn = season.getSeasonTime();
        System.out.println(totalAutumn);
    }
}
