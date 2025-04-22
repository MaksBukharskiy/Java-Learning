package ProgramWithEnums;

public enum Season {
    SUMMER("Summer", 13), SPRING("Spring", 52), AUTUMN("Autumn", 12), WINTER("Winter", -10);

    private String seasonTime;
    private int temperature;

    Season(String seasonTime, int temperature){
        this.seasonTime = seasonTime;
        this.temperature = temperature;
    }

    public String getSeasonTime(){
        return seasonTime;
    }

    public int getTemperature(){
        return temperature;
    }
}
