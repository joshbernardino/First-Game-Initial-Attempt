package Mechanics;

public class DieMechanic {

    private int dieRollResult;
    private double random;
    public int numberOfSides;

    public int rollDie() {
        return (int) random * numberOfSides;
    }

}
