package InterfacesLearning;

public class Animal implements ShowInfo {
    public int id;

    public Animal(int id){
        this.id = id;
    }

    public void getId(){
        System.out.println("Your id is: " + id);
    }

    @Override
    public void hello(){
        System.out.println("Hello Animal " + id);
    }
}
