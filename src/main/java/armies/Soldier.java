package armies;

import behaviours.IAttack;
import behaviours.IDefend;
import enums.Defences;
import enums.Weapon;

public abstract class Soldier implements IAttack, IDefend {

    private Weapon soldierType;
    private String companyName;
    private Defences defence;
    private int companyHealth;

    public Soldier(String companyName, Weapon soldierType, Defences defence, int companyHealth){
        this.companyName = companyName;
        this.soldierType = soldierType;
        this.defence = defence;
        this.companyHealth = companyHealth;
    }

    public Weapon getSoldierType() {
        return soldierType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Defences getDefence() {
        return defence;
    }

    public void setDefence(Defences defence) {
        this.defence = defence;
    }

    public int getCompanyHealth() {
        return companyHealth;
    }

    public void attack(Soldier soldier){
        int defendingSoldiersDefence = soldier.defence.getValue();
        soldier.companyHealth += defendingSoldiersDefence;
        soldier.companyHealth -= soldierType.getValue();
    }

    public void defend(Soldier soldiers){

    }
}
