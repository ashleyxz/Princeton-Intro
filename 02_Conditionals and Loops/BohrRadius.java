/******************************************************************************
 *  Compilation:  javac BohrRadius.java
 *  Execution:    java BohrRadius r
 *
 *  Application of Newton's method.
 *  Write a program BohrRadius.java that
 *  finds the radii where the probability of finding the electron in the 4s
 *  excited state of hydrogen is zero.
 *
 *  The probability is given by:
 *  (1 - 3r/4 + r2/8 - r3/192)2 e-r/2,
 *  where r is the radius in units of the Bohr radius (0.529173E-8 cm).
 *  Use Newton's method.
 *  By starting Newton's method at different values of r,
 *  you can discover all three roots. Hint: use initial values of r= 0, 5, and 13.
 *  Challenge: explain what happens if you use an initial value of r = 4 or 12.
 *
 *  Find the radii where the probability of finding the electron in the
 *  4s excited state of hydrogen is zero. Te probability is given by:
 *
 *      (1 - 3 r / 4 + r^2 / 8 - r^3 / 192)^2 exp(-r/2)
 *
 *  where r is the radius in units of the Bohr radius (0.529173E-8 cm).
 *  This is equivalent to finding the roots of
 *
 *       f(r) = 1 - 3r/4 + r^2 / 8 - r^3 / 192 = 0
 *
 *  We find them using Newton's method. The true roots are:
 *  1.871644455, 6.610814579, and 15.51754097. Depending on which
 *  value we use to start Newton's method, we find a different one.
 *
 *
 *  % java BohrRadius 0.0
 *  f(1.8716444550481757) = 1.1796119636642288E-16
 *
 *  % java BohrRadius 10
 *  f(6.610814578664557) = 1.1102230246251565E-15
 *
 *  % java BohrRadius 13
 *  f(15.517540966287266) = -3.552713678800501E-15
 *
 *  % java BohrRadius 20
 *  f(15.517540966287264) = 0.0
 *
 ******************************************************************************/
public class BohrRadius {

    public static void main(String[] args) {
        double r = Double.parseDouble(args[0]);

        double EPSILON = 1E-14;         // desired accuracy
        double f = 0.0;                // f(r)
        double df = 0.0;                // f'(r)

        // do at most 20 Newton iterations
        for (int i = 0; i < 20; i++) {

            // the function f(r)
            f = 1 - 3 * r / 4 + r * r / 8 - r * r * r / 192;

            // the derivative f'(r)
            df = -3.0 / 4.0 + r / 4 - r * r / 64;

            // Newton update
            r = r - f / df;

            // stop early if found root up to desired accuracy
            if (Math.abs(f) < EPSILON) break;

        }

        System.out.println("f(" + r + ") = " + f);
    }
}

