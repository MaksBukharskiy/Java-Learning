package inherritanceLearning;

public class Dog extends Animal{
    public void bark(){
        System.out.println("Bark");
    }

    @Override
    public void sing(){
        System.out.println("Dog is Singing");
    }

    @Override
    public void eat(){
        System.out.println("Dog is Eating");
    }
}
