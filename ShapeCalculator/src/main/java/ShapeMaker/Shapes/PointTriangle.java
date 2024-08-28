package ShapeMaker.Shapes;

public class PointTriangle {
    public Point a;
    public Point b;
    public Point c;


    /**
     * @param a
     * @param b
     * @param c
     */
    public PointTriangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Method calculating the area of the triangle using Heron's Formula:
     * <a href="https://en.wikipedia.org/wiki/Heron%27s_formula">Wikipedia</a>
     *
     * @return area
     */

    public double getArea() {
        double side_ab = this.a.distanceTo(this.b);
        double side_bc = this.b.distanceTo(this.c);
        double side_ca = this.c.distanceTo(this.a);

        double s = (side_ab + side_bc + side_ca) / 2.0;
        return Math.sqrt(s * (s - side_ab) * (s - side_bc) * (s - side_ca));

    }

    /**
     * Calculates whether triangle is equilateral, isosceles, or scalene
     *
     * @return string representing the category
     */
    public String getCategory() {

        double side_ab = this.a.distanceTo(this.b);
        double side_bc = this.b.distanceTo(this.c);
        double side_ca = this.c.distanceTo(this.a);

        if ((side_ab == side_bc) && (side_bc == side_ca)) {
            return "equilateral";
        } else if ((side_ab == side_bc) || (side_ab == side_ca) || (side_bc == side_ca)) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    @Override
    public String toString() {
        String category = this.getCategory();
        double area = this.getArea();

        return "This triangle has an area of " + area + " and is a " + category + " triangle.";

    }

    public double getPerimeter(){
        double side_ab = this.a.distanceTo(this.b);
        double side_bc = this.b.distanceTo(this.c);
        double side_ca = this.c.distanceTo(this.a);

        return side_ab + side_bc + side_ca;
    }
}
