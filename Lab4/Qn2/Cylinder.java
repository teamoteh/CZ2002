package CZ2002.Lab4.Qn2;

public class Cylinder extends Circle{
    public double height;
	
	public Cylinder(double height, double radius) {
		super(radius);
		this.height = height;
	}
	
	public double findSurfaceArea() {
		return (2 * Math.PI * super.getRadius() * this.height)
				+ (Math.PI * Math.pow(super.getRadius(), 2));
	}
}
