package CZ2002.Lab4.Qn2;

public class Sphere extends Circle{

    public Sphere(double radius){
        super(radius);
    }
       
    public double findSurfaceArea(){
        double surfaceArea = 4 * Math.PI * Math.pow(this.radius, 2);
        return surfaceArea;
    }
}
