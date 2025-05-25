package TreeSetLearning;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondTest {
    public static void main(String[] args) {
        Set <Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(52);
        treeSet.add(-1);
        treeSet.add(-2);

        treeSet.remove(1);

        System.out.println(treeSet.isEmpty());
        System.out.println(treeSet);
    }
}
