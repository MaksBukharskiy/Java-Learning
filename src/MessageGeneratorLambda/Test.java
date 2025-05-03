package MessageGeneratorLambda;

public class Test {
    public static void main(String[] args) {
        Generate generationHello = name -> "Hello " + name + "!";
        Generate generationGoodbye = name -> "Goodbye " + name + '!';

        System.out.println(generationHello.generate("Maks"));
        System.out.println(generationGoodbye.generate("Maks"));
    }
}
