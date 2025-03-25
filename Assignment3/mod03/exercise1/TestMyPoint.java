package mod03.exercise1;
// create a TestMyPoint program that does the following:

import java.net.Proxy;

// Assign stray the reference value of the existing variable end.
// Print out stray and end.
// Assign new values to the x and y members of the variable stray.
// Print out stray, end and start.
public class TestMyPoint {
    public static void main(String args[]){
        MyPoint start = new MyPoint();
        MyPoint end = new MyPoint();

        start.x = 10;
        start.y = 10;

        end.x = 20;
        end.y = 30;

        System.out.println("End point is " + end);
        System.out.println("Start point is " + start);

        MyPoint stray = new MyPoint();

        stray = end;

        start.x = 10;
        start.y = 10;

        end.x = 47;
        end.y = 30;

        System.out.println();
        System.out.println("Stray point is " + stray);
        System.out.println("End point is " + end);
        System.out.println("Start point is " + start);
    }


}
