package ShapeMaker.Shapes;

public class Circle {
    private Point center;
    private double radius;

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getPerimeter(){
       return Math.PI*this.radius*2;
    }

    public Circle(Point center, double radius){
        this.center = center;

        if(radius <= 0){
            throw new IllegalArgumentException("INCORRECT!!");
        }
        this.radius = radius;
    }


}
