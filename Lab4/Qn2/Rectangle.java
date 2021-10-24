package CZ2002.Lab4.Qn2;

public class Rectangle {
    public double length;
    public double breadth;
    
    public Rectangle(){
        this.length = 0;
        this.breadth = 0;
    }

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double findArea(){
        double area = length*breadth;
        return area;
    }

    public double getLength(){
        return this.length;
    }

    public double getBreadth(){
        return this.breadth;
    }
}
