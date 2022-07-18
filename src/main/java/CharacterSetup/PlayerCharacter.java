package CharacterSetup;

import java.util.HashMap;
import java.util.Map;

public class PlayerCharacter {

    private String name;
    private int health;
    private int str;
    private int dex;
    private int con;
    private int playerId;
    private String playerClass;

    //heal
    public void heal(int amountToHeal) {
        this.health += amountToHeal;
    }

    //take dmg
    public void takeDamage(int damageTaken) {
        this.health -= damageTaken;
    }

    //attack
    public int attack() {
        return 0;
    }

    //do dmg
    public int dealDamage() {
        return 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

}
