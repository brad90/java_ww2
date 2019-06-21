package armies;

import enums.AxisAllies;
import enums.Defences;
import enums.Weapon;

public class Tank extends Soldier {

    private AxisAllies axisAllies;


    public Tank(String companyName, Weapon soldierType, Defences defence, int companyHealth, AxisAllies axisAllies) {
        super(companyName, soldierType, defence, companyHealth);
        this.axisAllies = axisAllies;
    }
}
