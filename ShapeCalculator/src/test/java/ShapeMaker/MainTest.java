package ShapeMaker;

import ShapeMaker.Shapes.Point;
import ShapeMaker.Shapes.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    double ROUNDING_TOLERANCE = 0.0001;
    @Test
    void triangle_category() {
        Triangle a = new Triangle(new Point(0,0),new Point(6,0), new Point(3,3*Math.sqrt(3)));
        Triangle b = new Triangle(new Point(0,0),new Point(6,0),new Point( 3,0));
        Triangle c = new Triangle(new Point(0,-3),new Point(0,0),new Point(-4,0));

        assertEquals("equilateral", a.getCategory(), "Equilateral triangle at 0,0 3,3*sqrt3, 6,0");
        assertEquals("isosceles", b.getCategory(), "Equilateral triangle at 0,0 3,3*sqrt3, 6,0");
        assertEquals("scalene",c.getCategory(), "Expected 5. 3,4,5 right triangle at (0,-3) (0,0), (-4,0)");
    }

    @Test
    void triangle_area() {
        Triangle a = new Triangle(new Point(0,0),new Point(2,0),new Point(0,2));
        Triangle b = new Triangle(new Point(0,0),new Point(0,0),new Point(0,0));
        Triangle c = new Triangle(new Point(0,-3),new Point(0,0),new Point(-4,0));

        //Rounding error causes failure with assertEquals, so instead it is |expected - actual| < error
        assertTrue(Math.abs(2 - a.getArea()) < ROUNDING_TOLERANCE, "Expected 5.  Straight line from origin to 0,5");
        assertTrue(Math.abs(0 - b.getArea())< ROUNDING_TOLERANCE, "Expected 0. origin to origin");
        assertTrue(Math.abs(6 - c.getArea()) < ROUNDING_TOLERANCE, "Expected 6. 3,4,5 right triangle at (0,-3) (0,0), (-4,0)");
    }

    @Test
    void point_distance() {
        Point a = new Point(0,0);
        Point b = new Point(0,5);
        Point c = new Point(0,-3);
        Point d = new Point(-4,0);
        assertEquals(5,a.distanceTo(b), "Expected 5.  Straight line from origin to 0,5");
        assertEquals(0,a.distanceTo(a), "Expected 0. origin to origin");
        assertEquals(5,c.distanceTo(d), "Expected 5. 3,4,5 right triangle at (0,-3) (0,0), (-4,0)");

    }
}