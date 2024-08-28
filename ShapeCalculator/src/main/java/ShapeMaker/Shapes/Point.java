package ShapeMaker.Shapes;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double getX() {
        return this.x;
    }

    private double getY() {
        return this.y;
    }

    /**
     * Utility method that calculates the distance between two ordered pairs of points
     *
     * @param other : the point to measure against.
     * @return distance
     */
    public double distanceTo(Point other) {
        return Math.sqrt(((this.x - other.getX()) * (this.x - other.getX())) + ((this.y - other.getY()) * (this.y - other.getY())));
    }


}
