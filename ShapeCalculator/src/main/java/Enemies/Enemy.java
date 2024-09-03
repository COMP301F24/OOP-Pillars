package Enemies;

public class Enemy {
    protected int power;
    protected int toughness;


    public Enemy(int power, int toughness){
        this.power = power;
        this.toughness = toughness;
    }
    public void takeDamage(int damage){
        this.toughness -= damage;
    }
}
