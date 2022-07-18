package CharacterSetup;

public class CharacterCreation extends PlayerCharacter {

    public CharacterCreation(String name, int health, int str, int dex, int con) {
        super.setName(name);
        super.setHealth(health);
        super.setStr(str);
        super.setDex(dex);
        super.setCon(con);
    }

}
