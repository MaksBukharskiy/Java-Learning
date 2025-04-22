package ProgramWithEnums;

public class Test {
    public static void main(String[] args){
        Season season = Season.AUTUMN;

        String totalAutumn = season.getSeasonTime();
        int totalTemperature = season.getTemperature();

        System.out.println(totalAutumn);
        System.out.println(totalTemperature);
    }
}
