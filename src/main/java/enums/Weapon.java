package enums;

public enum Weapon {

    RIFLEMAN(2),
    TANK(10),
    ARTILLARY(5),
    COMMANDO(5),
    MACHINEGUN(4),
    MESHERSMCHMITT(4),
    SPITFIRE(7);

    private final int value;
    Weapon(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
