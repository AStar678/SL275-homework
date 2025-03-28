package exercise2;

public class TestMyPoint {
    public static void main(String[] args) {

        // Create a MyPoint object with default values
        System.out.println("Creating a MyPoint object with default values.");
        MyPoint point1 = new MyPoint();

        // Display the coordinates of the initial point
        System.out.println("Initial point coordinates: "+point1);

        // Create a MyPoint object with specified coordinates (3, 4)
        System.out.println("Creating a MyPoint object with specified coordinates (3, 4).");
        MyPoint point2 = new MyPoint(3, 4);

        // Display the coordinates of the second point
        System.out.println("Second point coordinates: " + point2);

        // Try to set the coordinates of the first point to (1, 2)
        System.out.println("Trying to set the coordinates of the first point to (1, 2).");
        point1.setXY(1, 2);
        System.out.println("First point coordinates after setting: " + point1);

        // Calculate the distance from the first point to the origin
        System.out.println("Calculating the distance of the first point to the origin.");
        double distanceToOrigin = point1.distance();
        System.out.printf("Distance to origin: %.2f\n", distanceToOrigin);

        // Calculate the distance between the first point and the second point
        System.out.println("Calculating the distance between the first point and the second point.");
        double distanceBetweenPoints = point1.distance(point2);
        System.out.printf("Distance between points: %.2f\n", distanceBetweenPoints);

        // Calculate the distance from the first point to the specified point (5, 6)
        System.out.println("Calculating the distance of the first point to the point (5, 6).");
        double distanceToGivenPoint = point1.distance(5, 6);
        System.out.printf("Distance to point (5, 6): %.2f\n", distanceToGivenPoint);
    }
}