/******************************************************************************
 *  Compilation:  javac SpringSeason.java
 *  Execution:    java day month
 *
 *  Prints true if the given day and month fall between March 20 (inclusive)
 *  and June 20 (inclusive).
 *
 *  % java SpringSeason 3 20
 *  true
 *
 *  % java SpringSeason 6 20
 *  true
 *
 *  % java SpringSeason 4 15
 *  true
 *
 *  % java SpringSeason 9 11
 * false
 *
 ******************************************************************************/

public class SpringSeason {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);


        boolean condition1 = (m == 3) && (d >= 20) && (d <= 31);
        boolean condition2 = (m == 4) && (d >= 1) && (d <= 30);
        boolean condition3 = (m == 5) && (d >= 1) && (d <= 31);
        boolean condition4 = (m == 6) && (d >= 1) && (d <= 20);


        boolean isSpring = condition1 || condition2 || condition3 || condition4;


        System.out.println(isSpring);
    }
}
