package People;


public class Student {
    private String name;
    private int credits;

    public Student(String name) {
        credits = 0;
        this.name = name;
    }

    public String getName() {
        return name;
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
