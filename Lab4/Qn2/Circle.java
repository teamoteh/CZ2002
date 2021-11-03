package CZ2002.Lab4.Qn2;

public class Circle implements Shape {
    public double radius;
    
    public Circle(){
        this.radius = 0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double findArea(){
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }
}
