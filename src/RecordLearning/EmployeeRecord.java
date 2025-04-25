package RecordLearning;

public record EmployeeRecord(String name, int EnployeeNumber) {
    public String greeting(){
        return "Hello, my name is " + name + " and i am " + EnployeeNumber + " years old.";
    }
}
