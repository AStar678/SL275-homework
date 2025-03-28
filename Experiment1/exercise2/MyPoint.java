package exercise2;

/**
 * This class represents a point in a two - dimensional plane.
 * It provides methods to manipulate the point's coordinates and calculate distances.
 */
public class MyPoint {
    private int x = 0;
    private int y = 0;

    /**
     * Default constructor. Initializes the point to the origin (0, 0).
     */
    public MyPoint() {

    }

    /**
     * Constructor with parameters. Initializes the point with the given x and y coordinates.
     * 
     * @param x The x - coordinate of the point.
     * @param y The y - coordinate of the point.
     */
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Getter method for the x - coordinate.
     * 
     * @return The x - coordinate of the point.
     */
    public int getX() {
        return x;
    }

    /**
     * Setter method for the x - coordinate.
     * 
     * @param x The new x - coordinate of the point.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Getter method for the y - coordinate.
     * 
     * @return The y - coordinate of the point.
     */
    public int getY() {
        return y;
    }

    /**
     * Setter method for the y - coordinate.
     * 
     * @param y The new y - coordinate of the point.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Sets both the x and y coordinates of the point simultaneously.
     * 
     * @param x The new x - coordinate of the point.
     * @param y The new y - coordinate of the point.
     */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns a string representation of the point in the format (x, y).
     * 
     * @return A string representing the point.
     */
    public String toString() {
        return ("(" + x + "," + y + ")");
    }

    /**
     * Calculates the distance between this point and the point with the given coordinates (x, y).
     * 
     * @param x The x - coordinate of the other point.
     * @param y The y - coordinate of the other point.
     * @return The distance between this point and the given point.
     */
    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    /**
     * Calculates the distance between this point and another MyPoint object.
     * 
     * @param another Another MyPoint object representing a point in the plane.
     * @return The distance between this point and the given MyPoint object.
     */
    public double distance(MyPoint another) {
        return Math.sqrt((another.x - this.x) * (another.x - this.x) + (another.y - this.y) * (another.y - this.y));
    }

    /**
     * Calculates the distance between this point and the origin (0, 0).
     * 
     * @return The distance between this point and the origin.
     */
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}