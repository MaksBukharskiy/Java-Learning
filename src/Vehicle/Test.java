package Vehicle;

public class Test {
    public static void main(String[] args){
        for(VehicleInfo info : VehicleInfo.values()){
            System.out.println("The car is " + info.getName());
            System.out.println("The horse power is " + info.getHp() + " h/p");
        }
    }
}
