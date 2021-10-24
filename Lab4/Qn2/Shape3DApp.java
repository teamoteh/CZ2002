package CZ2002.Lab4.Qn2;
import java.util.Scanner;

public class Shape3DApp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please input the total number of shapes: \n");
        int totalShapes = sc.nextInt();
        int shapeCount = 0;
        double totalArea = 0;

        do{
            System.out.print("Please choose the shape and enter the required dimensions: \n");
            System.out.print("(1) Sphere\n" +
                            "(2) Square-based Pyramid\n" +
                            "(3) Cuboid\n" +
                            "(4) Cone\n" +
                            "(5) Cylinder\n" +
                            "Choose a Shape: \n");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Please input the radius of the Sphere: ");
                    double rad = sc.nextInt();
                    Sphere sphere = new Sphere(rad);
                    System.out.println("Surface Area of the Sphere is: " + sphere.findSurfaceArea());
                    totalArea += sphere.findSurfaceArea();
                    shapeCount++;
                    break;
                case 2:
                    System.out.println("Please input the height of the Pyramid: ");
                    double height = sc.nextInt();
                    System.out.println("Please input the base of the Pyramid: ");
                    double base = sc.nextInt();
                    Pyramid pyramid = new Pyramid(height, base);
                    System.out.println("Surface Area of the Pyramid is: " + pyramid.findSurfaceArea());
                    totalArea += pyramid.findSurfaceArea();
                    shapeCount++;
                    break;
                case 3:
                    System.out.println("Please input the length of the Cuboid: ");
                    double length = sc.nextInt();
                    System.out.println("Please input the breadth of the Cuboid: ");
                    double breadth = sc.nextInt();
                    Cuboid cuboid = new Cuboid(length, breadth);
                    System.out.println("Surface Area of the Cuboid is: " + cuboid.findSurfaceArea());
                    totalArea += cuboid.findSurfaceArea();
                    shapeCount++;
                    break;
                case 4:
                    System.out.println("Please input the height of the Cone: ");
                    height = sc.nextInt();
                    System.out.println("Please input the diameter base of the Cone: ");
                    double diamBase = sc.nextInt();
                    Cone cone = new Cone(height, diamBase);
                    System.out.println("Surface Area of the Cone is: " + cone.findSurfaceArea());
                    totalArea += cone.findSurfaceArea();
                    shapeCount++;
                    break;
                case 5:
                    System.out.println("Please input the height of the Cylinder: ");
                    height = sc.nextInt();
                    System.out.println("Please input base diameter of the Cylinder: ");
                    diamBase = sc.nextInt();
                    Cylinder  cylinder = new Cylinder(height, diamBase/2);
                    System.out.println("Surface Area of the Cylinder is: " + cylinder.findSurfaceArea());
                    totalArea += cylinder.findSurfaceArea();
                    shapeCount++;
                    break;
            }
        }while(shapeCount < totalShapes);
        System.out.println("The total area of the 3-D Figure is: " + totalArea);
        System.exit(0);
    }
}
