package PolymorphysmProgram;

public class Animal {
    private String name;
    private int age;

    private static int animalCount = 0;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        animalCount++;
    }

    //Setters

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }else{
            System.out.println("Invalid Age");
        }
    }

    //Getters

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    //Methods

    public void displayInfo(){
        System.out.println("Animal: " + name + " Age: " + age);
    }

    //Static method

    public static int getAnimalCount(){
        return animalCount;
    }
}
