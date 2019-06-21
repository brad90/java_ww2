package armies;

import enums.AxisAllies;
import enums.Defences;
import enums.Weapon;

public class Rifleman extends Soldier {

    private AxisAllies axisAllies;

    public Rifleman(String companyName, Weapon weapon, Defences defence, int troopHealth, AxisAllies axisAllies){
        super(companyName, weapon, defence, troopHealth);
        this.axisAllies = axisAllies;
    }







}
