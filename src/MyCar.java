public class MyCar {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setBrand("Ferrari");
        myCar.setModel("Spider");

        System.out.println("The brand of the car: " + myCar.getBrand());
        System.out.println("The model of the car: " + myCar.getModel());

    }
}

class Car{

    private String brand;
    private String model;
    private String color;
    private int year;

    //Setters

    public void setBrand (String brand){
        if(brand.isEmpty()){
            System.out.println("Brand is empty");
        }
        else {
            this.brand = brand;
        }
    }

    public String getBrand(){
        return brand;
    }

    public void setModel (String model){
        if (model.isEmpty()) {
            System.out.println("Model is empty");
        }
        else {
            this.model = model;
        }
    }

    public String getModel(){
        return model;
    }
}