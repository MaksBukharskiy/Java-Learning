package OptionalLearning;

import java.util.Optional;

public class SecondTest {
    public static void main(String[] args) {
        Optional <String> name = Optional.of("Maks");
        System.out.println(name.get());
    }
}
