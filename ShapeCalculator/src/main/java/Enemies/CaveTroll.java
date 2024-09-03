package Enemies;

public class CaveTroll extends Enemy{
    String weapon = "mace";

    public CaveTroll(){
        super(60,75);
    }

    public void swingClub(Enemy enemy){
        enemy.takeDamage(this.power);
    }

    public void maul(Enemy enemy){
        enemy.takeDamage(this.power/2);
    }

}
