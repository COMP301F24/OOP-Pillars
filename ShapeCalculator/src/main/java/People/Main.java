package People;

public class Main {
    public static void main(String[] args){
        Professor emily = new Professor("Emily");
        Student   alex  = new Student("Alex");


        System.out.println(emily.getName());
        System.out.println(alex.getName());


        alex.takeCredits(30);
        System.out.println(alex.getStatus()); // "Sophomore"


        emily.promote();
        System.out.println(emily.getStatus());

    }
}
