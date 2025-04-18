package NestedClasses;

public class PorsheMain {
    public static void main(String[] args) {
        Porshe porshe = new Porshe("Cayenne");
        Porshe.Details detail = porshe.new Details("Wall Street", 10);

        detail.Total();
    }
}
