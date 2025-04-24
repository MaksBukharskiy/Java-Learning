package Traffic;

public class Test {
    public static void main(String[] args){
        TrafficLight traffic1 = TrafficLight.RED;
        TrafficLight traffic2 = TrafficLight.GREEN;
        TrafficLight traffic3 = TrafficLight.YELLOW;

        String getTraffic1 = traffic1.getMessage();
        String getTraffic2 = traffic2.getMessage();
        String getTraffic3 = traffic3.getMessage();


        System.out.println(getTraffic1);
        System.out.println(getTraffic2);
        System.out.println(getTraffic3);

    }
}
