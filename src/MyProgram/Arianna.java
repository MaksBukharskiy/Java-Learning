package MyProgram;

public class Arianna implements Info {
    String name;

    public Arianna(String name){
        this.name = name;
    }

    @Override
    public void totalInfo(){
        System.out.println("My name is " + name);
    }
}