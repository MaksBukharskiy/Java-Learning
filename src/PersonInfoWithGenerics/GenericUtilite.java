package PersonInfoWithGenerics;

public class GenericUtilite {
    public static <T> String checkContent(T item){
        return "Box contains: " + item.toString();
    }
}
