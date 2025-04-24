package Traffic;

public enum TrafficLight {
    RED("Red"), GREEN("Green"), YELLOW("Yellow");

    private final String message;

    TrafficLight(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
