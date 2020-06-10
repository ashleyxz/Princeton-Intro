/******************************************************************************
 *  Compilation:  javac ThreeParameters.java
 *  Execution:    java ThreeParameters a b c
 *
 Write a program that reads in three parameters
 and prints true if all three are equal, and false otherwise.
 *
 *  %  java ThreeParameters a b c
 *
 ******************************************************************************/


public class ThreeParameters {
    public static void main(String[] args) {

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);


        boolean condition = a == b && b == c;

        System.out.println(condition);
    }
}
