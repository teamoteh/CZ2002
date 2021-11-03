package CZ2002.Lab4.Qn2;

public class Triangle {
    public double height;
    public double base;
    
    public Triangle(){
        this.height = 0;
        this.base = 0;
    }

    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    public double getHeight(){
        return this.height;
    }

    public double getBase(){
        return this.base;
    }

    public double findArea(){
        double area = 0.5 * this.height * this.base ;
        return area;
    }
}
