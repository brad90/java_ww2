package armies;

import behaviours.IAttack;
import behaviours.IDefend;
import enums.Defences;
import enums.Weapon;

import java.util.Random;

public abstract class Soldier implements IAttack, IDefend {

    private Weapon soldierType;
    private String companyName;
    private Defences defence;
    private int companyHealth;

    public Soldier(String companyName, Weapon soldierType, Defences defence, int companyHealth){
        this.companyName = companyName;
        this.soldierType = soldierType;
        this.defence = defence;
        this.companyHealth = companyHealth + this.defence.getValue();
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

    public void setCompanyHealth(int hp) {
        this.companyHealth -= hp;
    }


    public void attack(Soldier soldier){
        Random rand = new Random();
        int randomAttack = rand.nextInt(6);
        randomAttack += 1;
        if(randomAttack > 0){
            soldier.takeDamage(this.soldierType.getValue());
        }
    }


    public boolean shouldSoldiersSurrender(){
        boolean surrender = true;
        if(this.companyHealth < 5) {
            return surrender;
        }else{
            return false;
        }
    }

    public void takeDamage(int attackValue){
        this.setCompanyHealth(attackValue);
    }
}
