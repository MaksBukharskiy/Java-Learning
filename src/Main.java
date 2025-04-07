public class Main {
    public static void main(String[] args) {
    Person person1 = new Person();
    person1.setName("Maks");
    person1.setAge(16);
    person1.getInfo();
    int year1 = person1.calculateYearsToRetirement();
    System.out.println("Years to retirement: " + year1);

    System.out.println();

    Person person2 = new Person();
    person2.setName("Andrey");
    person2.setAge(22);
    person2.getInfo();
    int year2 = person2.calculateYearsToRetirement();
    System.out.println("Years to retirement: " + year2);
    }
}

class Person {
    private String name;
    private int age;


    public void setName(String userName){
        if(userName.isEmpty()){
            System.out.println("Name is empty");
        }else{
        name = userName;
        }
    }

    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        if (userAge < 0){
            System.out.println("Age is negative");
        }
        else {
            age = userAge;
        }
    }

    public int getAge(){
        return age;
    }

    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }

    void getInfo(){
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }

    int calculateYearsToRetirement(){
        int years;

        years = 65 - age;
        return years;
    }
}