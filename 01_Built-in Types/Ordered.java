/******************************************************************************
 *  Compilation:  javac Ordered.java
 *  Execution:    java Ordered
 *
 *  Boolean and integer variables.
 *  * Restriction: You must not use if for this problem — you can use it
 *  * starting next week. Write a program Ordered.java that reads in three
 *  * int command-line arguments, x, y, and z. Define a boolean variable
 *  * b whose value is true if the three values are either in strictly
 *  * ascending order (x < y < z) or in strictly descending order (x > y > z),
 *  * and false otherwise.
 *  Print out the variable isOrdered using System.out.println(b).
 *  *
 *
 *  % java Ordered x y z
 *
 ******************************************************************************/

public class Ordered {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);


        boolean condition1 = x < y && y < z;
        boolean condition2 = x > y && y > z;

        boolean b = condition1 || condition2;

        System.out.println(b);
    }
}
