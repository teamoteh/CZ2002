package CZ2002.Lab4.Qn2;

public class Cone extends Circle{
    public double length;
    public double height;

    public Cone(double height, double base){
        super(base/2);
        this.height = height;
    }

    public double findSurfaceArea(){
        this.length = Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.radius, 2));
        double lengthSurfaceArea = Math.PI * (this.radius) * this.length;
        return lengthSurfaceArea;
    }
}
