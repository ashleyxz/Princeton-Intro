/******************************************************************************
 *  Compilation:  javac PowersOfK.java
 *  Execution:    java PowersOfK n
 *
 *  Write a program PowersOfK.java that takes an integer K
 *  as command-line argument
 *  and prints all the positive powers of K in the Java long data type.
 *  Note: the constant Long.MAX_VALUE is the value of the largest integer in long.
 *
 *
 *  % java PowersOfK 5
 ******************************************************************************/

public class PowersOfK {
    public static void main(String[] args) {

        // command-line argument
        int k = Integer.parseInt(args[0]);

        int power = 0;

        if (Math.abs(k) != 1 && k != 0) {
            while (Math.pow(k, power) < Long.MAX_VALUE) {
                long result = (long) Math.pow(k, power);

                if (result > 0)
                    System.out.println(result);

                power++;
            }
        }
        else
            System.out.println(k);

    }
}
