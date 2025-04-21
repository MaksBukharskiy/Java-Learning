package InterfacesLearning;

public class Test {
    public static void main(String[] args){
        Animal animal = new Animal(1243);
        Person person = new Person("Maks");

        animal.hello();
        person.hello();
    }
}
