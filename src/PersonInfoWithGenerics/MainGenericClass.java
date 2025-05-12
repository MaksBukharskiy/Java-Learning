package PersonInfoWithGenerics;

public class MainGenericClass <K, V>{
    private K key;
    private V value;

    public MainGenericClass(K key, V value){
        this.key = key;
        this.value = value;
    }

    public <T> V getValueIfKeyMatches(T inputKey){
        if(key.equals(inputKey)){
            return value;
        }
        return null;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }
}
