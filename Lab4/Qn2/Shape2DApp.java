package CZ2002.Lab4.Qn2;

import java.util.Scanner;

public class Shape2DApp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //initializing the number of shapes in total
        System.out.print("Please input the total number of shapes: \n");
        int totalShapes = sc.nextInt();
        int shapeCount = 0;
        double totalArea = 0;

        //menu options
        do{
            System.out.print("Please choose the shape and enter the required dimensions: \n");
            System.out.print("(1) Circle\n" +
                            "(2) Triangle\n" +
                            "(3) Rectangle\n" +
                            "Choose a Shape: \n");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Please input the radius of the Circle: ");
                    int rad = sc.nextInt();
                    Circle circle = new Circle(rad);
                    totalArea += circle.findArea();
                    shapeCount++;
                    break;
                case 2:
                    System.out.println("Please input the height of the Triangle: ");
                    int height = sc.nextInt();
                    System.out.println("Please input the base of the Triangle: ");
                    int base = sc.nextInt();
                    Triangle triangle = new Triangle(height, base);
                    totalArea += triangle.findArea();
                    shapeCount++;
                    break;
                case 3:
                    System.out.println("Please input the length of the Rectangle: ");
                    int length = sc.nextInt();
                    System.out.println("Please input the breadth of the Rectangle: ");
                    int breadth = sc.nextInt();
                    Rectangle rectangle = new Rectangle(length, breadth);
                    totalArea += rectangle.findArea();
                    shapeCount++;
                    break;
            }
        }while(shapeCount < totalShapes);
        System.out.println("The total area of the 2-D Figure is: " + totalArea);
        System.exit(0);
    }
}
