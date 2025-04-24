package AnimalEnums;

public class Test {
    public static void main(String[] args){
        AnimalEnum animalEnum1 = AnimalEnum.CROCODILE;
        AnimalEnum animalEnum2 = AnimalEnum.RABBIT;
        AnimalEnum animalEnum3 = AnimalEnum.LION;

        String total1 = animalEnum1.getTranslation();
        String total2 = animalEnum2.getTranslation();
        String total3 = animalEnum3.getTranslation();

        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);

    }
}
