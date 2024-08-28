package ShapeMaker;

import ShapeMaker.Shapes.*;

import java.util.Scanner;

public class Main {

    /**
     * Main method used for user interaction
     */
    public static void main(String[] args) {
        //userInteraction();
        //encapsulationDoubleExample();
        encapsulationPointExample();
        //transposeExample();
        //roundingExample();

        Square s = new Square(new Point(5,3), -10);
        System.out.println(s);

    }

    private static void userInteraction() {
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

        PointTriangle myTri = new PointTriangle(a, b, c);
        System.out.println(myTri);

    }

    public static void transposeExample(){
        Point p1 = new Point(5, 5);
        Point p2 = new Point(10, 15);
        Point p3 = new Point(15, -2);

        PointTriangle t1 = new PointTriangle(p1, p2, p3);


        System.out.println("Perimeter of T1 = " + t1.getPerimeter());

        t1.a.x += 5;
        t1.b.x += 5;
        t1.c.x += 5;

        System.out.println("Perimeter  of T1 = " + t1.getPerimeter());
    }
    public static void encapsulationPointExample(){


        Point p1 = new Point(5, 5);
        Point p2 = new Point(10, 15);
        Point p3 = new Point(15, -2);
        Point p4 = new Point(-3, -8);

        PointTriangle t1 = new PointTriangle(p1, p2,p3);
        PointTriangle t2 = new PointTriangle(p2, p3, p4);

        System.out.println("Perimeter of T1 = " + t1.getPerimeter());
        System.out.println("Perimeter of T2 = " + t2.getPerimeter());

        t1.a.x += 5;
        t1.b.x += 5;
        t1.c.x += 5;

        t2.a.x += 5;
        t2.b.x += 5;
        t2.c.x += 5;


        System.out.println("Perimeter of T1 = " + t1.getPerimeter());
        System.out.println("Perimeter of T2 = " + t2.getPerimeter());
    }

    public static void encapsulationDoubleExample(){


        Point p1 = new Point(5, 5);
        Point p2 = new Point(10, 15);
        Point p3 = new Point(15, -2);
        Point p4 = new Point(-3, -8);

        DoubleTriangle t1 = new DoubleTriangle(5,5,10,15,15,-2);
        DoubleTriangle t2 = new DoubleTriangle(10,15,15,-2,-3,-8);

        System.out.println("Perimeter of T1 = " + t1.getPerimeter());
        System.out.println("Perimeter of T2 = " + t2.getPerimeter());

        t1.a.x += 5;
        t1.b.x += 5;
        t1.c.x += 5;

        t2.a.x += 5;
        t2.b.x += 5;
        t2.c.x += 5;


        System.out.println("Perimeter of T1 = " + t1.getPerimeter());
        System.out.println("Perimeter of T2 = " + t2.getPerimeter());
    }

    public static void roundingExample(){
        double a = 0.1;
        double b = 0.3;

        System.out.println(((a+a+a)==b));

    }

}



