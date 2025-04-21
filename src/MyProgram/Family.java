package MyProgram;

public class Family {
    public static void main(String [] args){
        Info maks = new Maks("Maks"); //так как сущ метод из интерфейса Info
        Info arianna = new Arianna("Arianna"); //так как сущ метод из интерфейса Info

        maks.totalInfo();
        arianna.totalInfo();
    }
}
