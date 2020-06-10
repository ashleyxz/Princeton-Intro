/******************************************************************************
 *  Compilation:  javac Distance2.java
 *  Execution:    java Distance2  x1, y1, x2, y2
 *
 Write a program that takes four real-valued command line parameters
 x1, y1, x2, and y2
 and prints the Euclidean distance
 between the points (x1, y1) and (x2, y2). Use Math.sqrt().
 *
 *
 * % java Distance2
 *
 *
 *
 ******************************************************************************/
public class Distance2 {
    public static void main(String[] args) {

        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);


        double dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));


        System.out.println(
                "distance from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ") = " + dist);
    }
}
