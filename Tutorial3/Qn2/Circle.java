package CZ2002.Tutorial3.Qn2;

public class Circle extends Point {
    protected double r;
    
    public Circle(){
        r = 1;
    }

    public Circle(double radius){
        this.r = radius;
    }

    public Circle(double radius, int x, int y){
        super(x,y);
        this.r = radius;
    }

    public void setRadius(double radius){
        this.r = radius;
    }

    public String toString(){
        return "[ x is: " + this.x + ", y is: " + this.y 
        + ", radius is: " + this.r ;
    }

    public double getRadius(){
        return this.r;
    }

    public double area(){
        return Math.PI * Math.pow(this.r, 2);
    }
}
