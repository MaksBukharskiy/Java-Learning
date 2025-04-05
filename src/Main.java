public class Main {
    public static void main(String[] args) {
    Person person1 = new Person();
    String p1 = "Maks";
    int a1 = 16;
    person1.setNameAndAge(p1, a1);
    person1.getInfo();
    int year1 = person1.calculateYearsToRetirement();
    System.out.println("Years to retirement: " + year1);

    System.out.println();

    Person person2 = new Person();
    String s2 = "Andrey";
    int a2 = 18;
    person2.setNameAndAge(s2, a2);
    person2.age = 18;
    person2.getInfo();
    int year2 = person2.calculateYearsToRetirement();
    System.out.println("Years to retirement: " + year2);
    }
}

class Person {
    private String name;
    private int age;

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