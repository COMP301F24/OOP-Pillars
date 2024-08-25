package ShapeMaker;

import ShapeMaker.Shapes.Point;
import ShapeMaker.Shapes.Triangle;

import java.util.Scanner;

public class Main {

    /**
     * Main method used for user interaction
     */
    public static void main(String[] args) {
        //TODO: ERROR HANDLING
        Scanner s = new Scanner(System.in);
        String response; //variable for reading input

        //What shapes do we support
        String[] options = {"Triangle"};

        //Instructions
        System.out.println("Welcome to the shape maker!");
        System.out.println("Enter the number of the shape would you like to make?");

        //Print out 1-indexed options
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ":" + options[i]);
        }

        //Get answer from user
        response = s.nextLine();
        int answer = Integer.parseInt(response);

        //Convert to 0-indexed answer and process shape.
        switch (options[(answer - 1)]) {
            case "Triangle":
                System.out.println("Create a name for this triangle:");
                response = s.nextLine();
                System.out.println("Enter in 3 points in the form ax ay bx by cx cy:");
                response = s.nextLine();
                calculateTriangle(response);
                break;
            default:
                System.out.println("Invalid option.");
        }
        s.close();
    }

    /**
     * Method takes in a raw string of points in the form "ax ay bx by cx cy"
     *
     * @param input: raw string from user
     */

    public static void calculateTriangle(String input) {
        String[] tokens = input.split(" ");
        double ax = Double.parseDouble(tokens[0]);
        double ay = Double.parseDouble(tokens[1]);
        double bx = Double.parseDouble(tokens[2]);
        double by = Double.parseDouble(tokens[3]);
        double cx = Double.parseDouble(tokens[4]);
        double cy = Double.parseDouble(tokens[5]);

        Point a = new Point(ax, ay);
        Point b = new Point(bx, by);
        Point c = new Point(cx, cy);

        Triangle myTri = new Triangle(a, b, c);
        System.out.println(myTri);

    }

}


