package InicializerBlockLearning;

public class Database {
    private String url;
    private String username;
    private String password;
    private static boolean isConnected;


    static{
        isConnected = false;
        System.out.println("Статический инициализирующий блок выполнен. Подключение к базе данных не установлено");
    }

    {
        if(!isConnected){
            System.out.println("Инициализирующий блок экземпляра: Устанавливаем подключение к базе данных...");
            isConnected = true;
        }
    }

    public Database(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
        System.out.println("Конструктор выполнен для подключения к базе данных: " + url);
    }
}
