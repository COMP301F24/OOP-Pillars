package People;

public class Professor {
    private String name;
    private int status;

    public Professor(String name) {
        status = 0;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void promote() {
        if (status == 2) {
            throw new RuntimeException("Can't promote");
        }
        status++; // Adds 1 to the value of status
    }

    public String getStatus() {
        if (status == 0) {
            return "Assistant";
        } else if (status == 1) {
            return "Associate";
        } else {
            return "Full";
        }
    }
}
