public class LearningStatic {
    public static void main(String[] args) {
        Human.books = "Harry Potter";
        Human.howMany = 12;

        Human.total();
    }
}

class Human{
    public static String books;
    public static int howMany;

    public static void total(){
        System.out.println("You have read " + howMany + " " + books + " books");
    }
        }
длоцупдлоуыполдпыва