package ShapeMaker.Shapes;

public class Square {
    private double side;
    private Point topLeft;

    public Square(double side, Point topLeft){
        if(side <= 0){
            throw new IllegalArgumentException("INCORRECT!!");
        }
        this.topLeft = topLeft;
    }


    public double getSide(){
        return side;
    }

    public Point getTopLeft(){
        return this.topLeft;
    }

    public double getArea(){
        return side*side;
    }

    public double getPerimeter(){
        return side*4;
    }

    public void setSide(double side){
        if(side <= 0){
            throw new IllegalArgumentException("INCORRECT!!");
        }

        this.side = side;
    }

    @Override
    public String toString(){
        return "Valid square with a side length of " + this.side;

    }
}
