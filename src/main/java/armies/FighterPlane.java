package armies;

import enums.Defences;
import enums.Weapon;

public class FighterPlane extends Soldier{
    public FighterPlane(String companyName, Weapon soldierType, Defences defence, int companyHealth) {
        super(companyName, soldierType, defence, companyHealth);
    }


}
