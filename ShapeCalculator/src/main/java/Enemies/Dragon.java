package Enemies;

public class Dragon extends Enemy{

    public enum DragonType {
        FIRE(10, 8),
        ICE(7, 10),
        LIGHTNING(9, 7),
        EARTH(8, 9),
        WIND(6, 6),
        SHADOW(7, 8);

        final int power;
        final int toughness;

        // Constructor for the enum
        DragonType(int power, int toughness) {
            this.power = power;
            this.toughness = toughness;
        }

        // Getter for power
        public int getPower() {
            return power;
        }

        // Getter for toughness
        public int getToughness() {
            return toughness;
        }
    }

    private DragonType type = DragonType.ICE;

    public Dragon(DragonType type) {
        super(type.power, type.toughness);
        this.type = type;
    }

}