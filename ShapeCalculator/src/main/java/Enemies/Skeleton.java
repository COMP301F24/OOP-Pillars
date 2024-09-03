package Enemies;


public class Skeleton extends Enemy {

    // Enum for FighterType
    public enum FighterType {
        BRAWLER,
        ARCHER,  // Example additional types
        WARRIOR; // Example additional types
    }

    private FighterType fighterType;

    // Constructor
    public Skeleton(FighterType fighterType) {
        super(10,10);
        this.fighterType = fighterType;
    }

    // Method for punch, simulating an attack
    public void punch(Enemy enemy) {
        enemy.takeDamage(2);
    }

    // Method for run away
    public void runAway() {
        //aaaaaaaaahhhhhhhhhh!!!
    }
}
