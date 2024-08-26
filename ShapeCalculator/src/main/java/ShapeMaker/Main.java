package ShapeMaker;

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

        String category = calculateTriangleCategory(ax, ay, bx, by, cx, cy);
        double area = calculateTriangleArea(ax, ay, bx, by, cx, cy);
        System.out.print("This triangle has an area of " + area);
        System.out.print(" and is a " + category + " triangle.");

    }


    /**
     * Calculates whether triangle is equilateral, isosceles, or scalene
     *
     * @param ax - point 1 x
     * @param ay - point 1 y
     * @param bx - point 2 x
     * @param by - point 2 y
     * @param cx - point 3 x
     * @param cy - point 3 y
     * @return string representing the category
     */
    public static String calculateTriangleCategory(double ax, double ay, double bx, double by, double cx, double cy) {

        return "";
    }

    /**
     * Method calculating the area of the triangle using Heron's Formula:
     * <a href="https://en.wikipedia.org/wiki/Heron%27s_formula">Wikipedia</a>
     *
     * @param ax - point 1 x
     * @param ay - point 1 y
     * @param bx - point 2 x
     * @param by - point 2 y
     * @param cx - point 3 x
     * @param cy - point 3 y
     * @return area
     */
    public static double calculateTriangleArea(double ax, double ay, double bx, double by, double cx, double cy) {
        return -1;

    }

    /**
     * Utility method that calculates the distance between two ordered pairs of points
     *
     * @param x1 point 1 x
     * @param y1 point 1 y
     * @param x2 point 2 x
     * @param y2 point 2 y
     * @return distance
     */
    public static double calculatePointDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
    }


}
