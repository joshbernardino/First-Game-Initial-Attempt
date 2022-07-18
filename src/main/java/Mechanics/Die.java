package Mechanics;

public class Die {
    public int numberOfSides;
    private double rng;

    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.rng = Math.random();
    }

    public int rollDie() {
        return (int) (numberOfSides * rng);
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

}
