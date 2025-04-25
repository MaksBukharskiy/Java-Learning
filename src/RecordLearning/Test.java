package RecordLearning;

public class Test {
    public static void main (String[] args){
        EmployeeRecord employee1 = new EmployeeRecord("Alex", 52);
        EmployeeRecord employee2 = new EmployeeRecord("Maks", 16);

        System.out.println(employee2.name());
        System.out.println(employee1.name());

        System.out.println();

        System.out.println(employee1.EnployeeNumber());
        System.out.println(employee2.EnployeeNumber());

        System.out.println();

        System.out.println(employee1.greeting());
        System.out.println(employee2.greeting());
    }
}
