package CZ2002.Lab4.Qn2;

public class Pyramid {
    public Triangle triangle;
    public Square square;

    public Pyramid(){
        Triangle tri = new Triangle();
        Square squ = new Square();
        this.triangle = tri;
        this.square = squ;
    }

    public Pyramid(double height, double base){
        Triangle tri = new Triangle(height, base);
        Square squ = new Square(base);
        this.triangle = tri;
        this.square = squ;
    }

    public double findSurfaceArea(){
        double surfaceAreaTriangle = 2 * this.triangle.getHeight() * this.triangle.getBase();
        return surfaceAreaTriangle; 
    }
}
