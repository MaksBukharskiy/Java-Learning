package CustomerProgramWithQueue;

public class Customer {
    private String name;
    private int id;

    public Customer(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString(){
        return "Customer #" + id + " : " + name;
    }
}


