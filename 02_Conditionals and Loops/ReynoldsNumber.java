/******************************************************************************
 *  Compilation:  javac ReynoldsNumber.java
 *  Execution:    java ReynoldsNumber d v r m
 *
 *  Reynolds number.
 *  The Reynolds number is the ratio
 *  if inertial forces to viscous forces and is an important quantity in fluid dynamics.
 *  Write a program that takes in 4 command-line arguments,
 *  the diameter d, the velocity v, the density rho, and the viscosity mu,
 *  and prints the Reynold's number d * v * rho / mu
 *  (assuming all arguments are in SI units).
 *  If the Reynold's number is less than 2000, print laminar flow,
 *  if it's between 2000 and 4000, print transient flow,
 *  and if it's more than 4000, print turbulent flow.
 *
 ******************************************************************************/

public class ReynoldsNumber {
    public static void main(String[] args) {

        int d = Integer.parseInt(args[0]);
        int v = Integer.parseInt(args[1]);
        int r = Integer.parseInt(args[2]);
        int m = Integer.parseInt(args[3]);

        double reynoldsNumber = d * v * r / m;

        if (reynoldsNumber < 2000)
            System.out.println("laminar flow");

        else if (reynoldsNumber < 4000)
            System.out.println("transient flow");
        else
            System.out.println("turbulent flow");

    }
}

