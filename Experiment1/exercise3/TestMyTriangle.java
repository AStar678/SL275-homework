package exercise3;

import exercise2.MyPoint;

public class TestMyTriangle {
    public static void main(String[] args) {

        // Create three MyPoint objects to construct a triangle
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(3, 0);
        MyPoint point3 = new MyPoint(0, 4);

        // Construct a triangle using MyPoint objects
        System.out.println("Creating a triangle using MyPoint objects.");
        MyTriangle triangle1 = new MyTriangle(point1, point2, point3);

        // Display the vertex information of the triangle
        System.out.print("Triangle vertices: ");
        System.out.println(triangle1);

        // Calculate and display the perimeter of the triangle
        System.out.println("Calculating the perimeter of the triangle.");
        double perimeter = triangle1.getPerimeter();
        System.out.printf("Perimeter of the triangle: %.2f\n", perimeter);

        // Determine and display the type of the triangle
        System.out.println("Determining the type of the triangle:");
        System.out.println("Type of the triangle: " + triangle1.printType());

        // Construct an equilateral triangle using coordinates
        System.out.println("Creating an equilateral triangle using coordinates.");
        System.out.println("We couldn't create an equilateral triangle because of the integer - based implementation");

        // Construct an isosceles triangle using coordinates
        System.out.println("Creating an isosceles triangle using coordinates.");
        MyTriangle isoscelesTriangle = new MyTriangle(0, 0, 4, 0, 2, 3);
        System.out.println("Isosceles triangle vertices: " + isoscelesTriangle);
        System.out.println("Determining the type of the isosceles triangle:");
        System.out.println("Type of the isosceles triangle: " + isoscelesTriangle.printType());
    }
}