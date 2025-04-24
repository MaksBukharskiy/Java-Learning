package AnimalEnums;

public enum AnimalEnum {
    CROCODILE("Крокодил"), LION("Лев"), RABBIT("Кролик");

    private final String translation;

    AnimalEnum(String translation) {
        this.translation = translation;
    }

    public String getTranslation(){
        return translation;
    }
}

