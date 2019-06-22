import armies.MachineGunner;
import armies.Rifleman;
import armies.Tank;
import enums.AxisAllies;
import enums.Defences;
import enums.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RiflemanTest {


    Rifleman rifleman;
    Tank tankGerman;
    MachineGunner machineGunner;
    MachineGunner machineGunner2;

    @Before
    public void before(){
        rifleman = new Rifleman("Lancaster 5th Riflemen", Weapon.RIFLEMAN, Defences.PILLAR, 50, AxisAllies.ALLIES) {
        };
        tankGerman = new Tank("Panzer Group Kleist", Weapon.TANK, Defences.NONE, 100, AxisAllies.AXIES) {
        };
        machineGunner = new MachineGunner("Army Group Wöhler", Weapon.MACHINEGUN,Defences.BUNKER,50, AxisAllies.AXIES);
        machineGunner2 = new MachineGunner("Army Group Wöhler", Weapon.MACHINEGUN,Defences.BUNKER,4, AxisAllies.AXIES);
    }

    @Test
    public void getCompanyName(){
        assertEquals("Lancaster 5th Riflemen", rifleman.getCompanyName());
    }


    @Test
    public void getCompanyDefence(){
        assertEquals("PILLAR", (Defences.PILLAR).toString());
    }

    @Test
    public void getCompanyWeapon(){
        assertEquals("RIFLEMAN", (Weapon.RIFLEMAN).toString());
    }

    @Test
    public void getCompanyHealth(){
        assertEquals(50, rifleman.getCompanyHealth());
    }

    @Test
    public void getCompanyAxisAlly(){
        assertEquals("ALLIES", (AxisAllies.ALLIES).toString());
    }

    @Test
    public void attackEnemy(){
        rifleman.attack(tankGerman);
        assertEquals(98, tankGerman.getCompanyHealth());
    }

    @Test
    public void attackEnemyWithDefence(){
        rifleman.attack(machineGunner);
        assertEquals(54, machineGunner.getCompanyHealth());
    }



    @Test
    public void surrenderOrFightTODeath(){
        rifleman.attack(machineGunner2);
        rifleman.attack(machineGunner2);
        rifleman.attack(machineGunner2);
        rifleman.attack(machineGunner2);
        rifleman.attack(machineGunner2);
        rifleman.attack(machineGunner2);
        assertEquals(true, machineGunner2.shouldSoldiersSurrender());
    }
}
