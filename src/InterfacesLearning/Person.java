package InterfacesLearning;

public class Person implements ShowInfo {
    public String name;

    public Person (String name){
        this.name = name;
    }

    public void setName(){
        System.out.println("Your name is: " + name);
    }

    @Override
    public void hello(){
        System.out.println("Person " + name);
    }
}
