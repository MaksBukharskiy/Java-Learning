package MyProgram;

public class Maks implements Info {
    String name;

    public Maks(String name){
        this.name = name;
    }

    @Override
    public void totalInfo(){
        System.out.println("My name is " + name);
    }
}
