package ShapeMaker.Shapes;


public class Square implements IShape{
    private Point topLeft;
    private double side;

    /**
     * Square is defined as a quadrilateral with 90 degree corners and equal sides.  Defined here
     * without rotation by specififying the topLeft corner and the length of any given side.
     *
     * @param topLeft - Point for top left corner
     * @param side - length of side
     */
    public Square(Point topLeft, double side){
        if(side < 0){
            throw new IllegalArgumentException();
        }

        this.topLeft = topLeft;
        this.side = side;
    }

    /**
     * @return
     */
    public Point getTopLeft(){
        return this.topLeft;
    }

    /**
     * @return
     */
    public double getSide(){
        return this.side;
    }

    /**
     * @param side
     */
    public void setSide(double side){
        if(side < 0){
            throw new IllegalArgumentException();
        }
        this.side = side;
    }

    /**
     * @return
     */
    public double getArea(){
        return this.side*this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side*4;
    }

    @Override
    public void setCenterPoint() {
        //TODO LATER
    }

    /**
     * @return a string representing the thing
     */
    @Override
    public String toString(){
        return this.topLeft + ":" + this.side;
    }
}
