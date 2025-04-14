public class Mix {
    public static void main(String[] args) {
        System.out.println("Public: " + PublicClass.x);
    }

    class PublicClass{
        public static int x = 10;
        private static int y = 30;
    }

    class PrivateClass{
        private static void secretMethod (){
            System.out.println("No Fuck");
        }
    }
}

something