package PersonInfoWithGenerics;

public class Test {
    public static void main(String[] args) {
        MainGenericClass <String, Integer> nameAge = new MainGenericClass<>("Maks", 16);
        System.out.println(nameAge.getKey() + " : " + nameAge.getValue());

        Integer age = nameAge.getValueIfKeyMatches("Maks");
        System.out.println("Found age: " + age);

        String content = GenericUtilite.checkContent(12345);
        System.out.println(content);

    }
}
