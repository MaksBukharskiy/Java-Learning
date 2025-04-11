public class LearningStatic {
    public static void main(String[] args) {
        Human h1 = new Human("Maks", 16);
        Human h2 = new Human("Andrey", 19);

        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
    }

    static class Human {
        private String name;
        private int age;
        private static int countPeople;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
            countPeople++;
        }
        public void printNumberOfPeople() {
            System.out.println("Number of people: " + countPeople);
        }
    }
}