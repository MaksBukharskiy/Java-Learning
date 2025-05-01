package InicializerBlockLearning;

public class Test {
    public static void main(String[] args) {
        Database db1 = new Database("jdbc:mysql://localhost:3306/mydb", "user1", "pass1");
        Database db2 = new Database("jdbc:mysql://localhost:3306/mydb", "user2", "pass2");
    }
}
