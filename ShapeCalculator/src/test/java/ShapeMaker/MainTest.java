package ShapeMaker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    double ROUNDING_TOLERANCE = 0.0001;
    @Test
    void triangle_category() {
        assertEquals("equilateral", Main.triangle_category(0,0,6,0, 3,3*Math.sqrt(3)), "Equilateral triangle at 0,0 3,3*sqrt3, 6,0");
        assertEquals("isosceles", Main.triangle_category(0,0,6,0, 3,0), "Equilateral triangle at 0,0 3,3*sqrt3, 6,0");
        assertEquals("scalene",Main.triangle_category(0,-3, 0,0,-4,0), "Expected 5. 3,4,5 right triangle at (0,-3) (0,0), (-4,0)");
    }

    @Test
    void triangle_area() {

        //Rounding error causes failure with assertEquals, so instead it is |expected - actual| < error
        assertTrue(Math.abs(2 - Main.triangle_area(0,0,2,0,0,2)) < ROUNDING_TOLERANCE, "Expected 5.  Straight line from origin to 0,5");
        assertTrue(Math.abs(0 - Main.triangle_area(0,0,0,0,0,0)) < ROUNDING_TOLERANCE, "Expected 0. origin to origin");
        assertTrue(Math.abs(6 - Main.triangle_area(0,-3,0,0,-4,0)) < ROUNDING_TOLERANCE, "Expected 6. 3,4,5 right triangle at (0,-3) (0,0), (-4,0)");
    }

    @Test
    void point_distance() {
        assertEquals(5,Main.point_distance(0,0,0,5), "Expected 5.  Straight line from origin to 0,5");
        assertEquals(0,Main.point_distance(0,0,0,0), "Expected 0. origin to origin");
        assertEquals(5,Main.point_distance(0,-3,-4,0), "Expected 5. 3,4,5 right triangle at (0,-3) (0,0), (-4,0)");

    }
}