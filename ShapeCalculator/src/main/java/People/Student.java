package People;

public class Student extends Person{
    private int credits;

    public Student(String name) {
        super(name);
        credits = 0;
    }


    public int getCredits() {
        return credits;
    }

    public void takeCredits(int credits) {
        this.credits += credits;
    }

    public String getStatus() {
        if (credits < 30) {
            return "Freshman";
        } else if (credits < 60) {
            return "Sophomore";
        } else if (credits < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }
}