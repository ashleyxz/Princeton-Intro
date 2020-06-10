/******************************************************************************
 *  Compilation:  javac Swap.java
 *  Execution:    java Swap a b
 *
 *  Read in two integer command-line arguments a and b and
 *  swap their values using the swapping idiom described on p. 17.
 *  After each assignment statement, use System.out.println() to
 *  print out a trace of the variables.
 *
 *  %  java Swap 11 99
 *  a = 11, b = 99, c = 0
 *  a = 11, b = 99, c = 11
 *  a = 99, b = 99, c = 11
 *  a = 99, b = 11, c = 11
 *
 ******************************************************************************/

/*Swapping two variables refers to mutually exchanging the values of the variables.
Generally, this is done with the data in memory.

The simplest method to swap two variables is to use a third temporary variable :

        define swap(a, b)
        temp := a
        a := b
        b := temp*/

public class Swap {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Before swapping: a, b =" + a + ", " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a, b =" + a + ", " + b);


    }
}
