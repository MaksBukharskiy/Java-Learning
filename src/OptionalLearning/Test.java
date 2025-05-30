package OptionalLearning;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Optional<String> name = getName();

        if (name.isPresent()){
            System.out.println("Your name is " + name.get());
        }
        else {
            System.out.println("Hi, anonymous");
        }
    }

    public static Optional <String> getName(){
        boolean nameExists = Math.random() > 0.5;
        return nameExists ? Optional.of("Maks") : Optional.empty();
    }
}
