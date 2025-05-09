package Names;

@FunctionalInterface
public interface NameCheck {
    boolean check(String name) throws NameCheckException;
}
