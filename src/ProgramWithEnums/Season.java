package ProgramWithEnums;

public enum Season {
    SUMMER("Summer"), SPRING("Spring"), AUTUMN("Autumn"), WINTER("Winter");

    private String seasonTime;

    Season(String seasonTime){
        this.seasonTime = seasonTime;
    }

    public String getSeasonTime(){
        return seasonTime;
    }
}
