package Names;
import Names.NameCheckException;

public class NamesValidator {
    public static void validateName(String Name) throws NameCheckException{
        NameCheck isShort = (n) ->{
            if(n.length() < 2){
                throw new NameCheckException("Имя не должно быть меньше 2 символов");
            }
            return true;
        };

        NameCheck isLong = (n) ->{
            if (n.length() > 10) {
                throw new NameCheckException("Имя не должно превышать 10 символов");
            }
            return true;
        };

        isShort.check(Name);
        isLong.check(Name);
    }
}
