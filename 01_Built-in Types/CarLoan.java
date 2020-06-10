/******************************************************************************
 *  Compilation:  javac CarLoan.java
 *  Execution:    java CarLoan principal years rate
 *
 * Write a program CarLoan.java that reads in three command-line arguments
 * P, Y, and R
 * and calculates the monthly payments you would have to make
 * over Y years to pay off a P dollar loan at R per cent interest compounded monthly.
 * The formula is The formula is
 *
 *
 P r
 payment =  ---------------,where n = 12 * Y, r = (R / 100) / 12
 1  - (1 + r)^(-n)
 *
 *
 *  Calculate the monthly payments if you take out a $principal loan for
 *  the specified number of years at the specified interest rate,
 *  where interested is compounded monthly.
 *
 *                  principal * rate
 *     payment =  -------------------      where n = 12 * years,
 *                1  - (1 + r)^(-n)              r = (rate / 100) / 12
 *
 *
 *  % java CarLoan 20000 5 6
 *  Monthly payments = 386.6560305885655
 *  Total interest   = 3199.361835313932
 *
 *
 *  Bugs
 *  ----
 *  Does not work if rate = 0% interest. Easy to fix if you know about
 *  if-else statements.
 *
 ******************************************************************************/


public class CarLoan {
    public static void main(String[] args) {

        double principal = Double.parseDouble(args[0]);
        double years = Double.parseDouble(args[1]);
        double rate = Double.parseDouble(args[2]);


        double n = years * 12; // number of months
        double r = (rate / 100) / 12; // monthly interest rate

        double monthlypayment = (principal * r) / (1 - Math.pow(1 + r, -n));
        double interest = monthlypayment * n - principal;

        System.out.println("Monthly payment = " + monthlypayment);
        System.out.println("Total interest =" + interest);


    }
}
