package enums;

public enum Defences {

    BUNKER(6),
    RIDGE(2),
    SANDBAGS(2),
    PILLAR(1),
    DUNE(1),
    BUILDING(4),
    NONE(0);

    private final int value;
    Defences(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
