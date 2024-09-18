package Animals.Composition;

public class Main {
    public static void main(String[] args) {
        FlyingBird eagle = new FlyingBird();
        eagle.fly();

        Ostrich ostrich = new Ostrich();
        ostrich.run();
    }
}