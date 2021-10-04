package Tutorial3.Qn2;

public class Cylinder extends Circle{
    protected double h;

    public Cylinder(){
        h = 1.0;
    }
    public Cylinder(double r, int x, int y, double height){
        super(r, x, y);
        this.h = height;
    }
    public Cylinder(double height){
        this.h = height;
    }
    public void setHeight(double height){
        this.h  = height;
    }
    public String toString(){
        return "Height is: " + this.h + ", Radius is: " + this.r + " at point [" 
        + this.x + "," + this.y + "]";
        }
    public double volume(){
        double circleArea = super.area();
        return circleArea * h;
    }    
    public double area(){
        return 2 * (super.area() + Math.PI * super.getRadius() * h);
    }
}
