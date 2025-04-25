package Vehicle;

public enum VehicleInfo {
    MERCEDES(500, "Mercedes");

    private int hp;
    private String name;

    VehicleInfo(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }
}

