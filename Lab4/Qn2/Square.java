package CZ2002.Lab4.Qn2;

public class Square {
    public double length;
    
    public Square(){
        this.length = 0;
    }

    public Square(double length){
        this.length = length;
    }

    public double findArea(){
        double area = Math.pow(this.length, 2);
        return area;
    }

    public double getLength(){
        return this.length;
    }
}
