/******************************************************************************
 *  Compilation:  javac ThreeSort.java
 *  Execution:    java ThreeSort a b c
 *
 *  Read 3 integer values from the command line and print them
 *  in ascending order.
 *
 *  % java ThreeSort 17 50 33
 *  17
 *  33
 *  50
 *
 *  % java ThreeSort 50 33 17
 *  17
 *  33
 *  50
 *
 *  % java ThreeSort 17 50 17
 *  17
 *  17
 *  50
 *
 ******************************************************************************/


public class ThreeSort {
    public static void main(String[] args) {

        // Get three numbers from the command line
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Find min of all three numbers
        int min = Math.min(a, Math.min(b, c));

        // Find max of all three numbers
        int max = Math.max(a, Math.max(b, c));

        // Find middle number
        int middle = a + b + c - min - max;

        // Print out the result
        System.out.println(min + " , " + middle + " , " + max);

        // // print stats
        // System.out.println(min);
        // System.out.println(middle);
        // System.out.println(max);

    }
}
