/******************************************************************************
 *  Compilation:  javac DistinctValues.java
 *  Execution:    java DistinctValues
 *
 * Write a program that takes three integer command-line arguments a, b, and c and
 * print the number of distinct values (1, 2, or 3) among a, b, and c.
 ******************************************************************************/

public class DistinctValues {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b && a == c)
            System.out.println("the number of distict value is 1.");

        else if (a == b && b != c)
            System.out.println("the number of distict value is 2.");

        else if (b == c && a != b)
            System.out.println("the number of distict value is 2.");

        else if (a == c && a != b)
            System.out.println("the number of distict value is 2.");

        else
            System.out.println("the number of distict value is 3.");

    }
}

