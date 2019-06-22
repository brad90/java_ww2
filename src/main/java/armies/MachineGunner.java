package armies;

import enums.AxisAllies;
import enums.Defences;
import enums.Weapon;

public class MachineGunner extends Soldier {

    private AxisAllies alliesAxis;
    public MachineGunner(String companyName, Weapon soldierType, Defences defence, int companyHealth, AxisAllies alliesAxis) {
        super(companyName, soldierType, defence, companyHealth);
        this.alliesAxis = alliesAxis;
    }



}
