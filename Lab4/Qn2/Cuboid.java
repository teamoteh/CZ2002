package CZ2002.Lab4.Qn2;

public class Cuboid {
    public Rectangle rectangle;
    public Square square;

    public Cuboid(){
        Rectangle rec = new Rectangle();
        Square squ = new Square();
        this.rectangle = rec;
        this.square = squ;
    }

    public Cuboid(double length, double breadth){
        Rectangle rec = new Rectangle(length, breadth);
        Square squ = new Square(breadth);
        this.rectangle = rec;
        this.square = squ;
    }

    public double findSurfaceArea(){
        double baseArea = this.square.findArea();
        double sideArea = 4 * this.rectangle.findArea();
        double totalArea = baseArea + sideArea;
        return totalArea;
    }
}
