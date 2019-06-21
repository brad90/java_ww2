package armies;

import enums.Defences;
import enums.Weapon;

public class Commando extends Soldier{
    public Commando(String companyName, Weapon soldierType, Defences defence, int companyHealth) {
        super(companyName, soldierType, defence, companyHealth);
    }
}
