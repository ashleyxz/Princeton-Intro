/******************************************************************************
 *  Compilation:  javac StandardDeviation.java
 *  Execution:    java StandardDeviation
 *
 *  Generate and print 5 random values between 0.0 and 1.0, and print
 *  their average value, min value, and max value.
 *
 *  Modify Exercise 1.2.30 so that it prints the sample standard deviation
 *  in addition to the average.
 *
 *  % java StandardDeviation
 *
 *  0.7203537279117841
 *  0.09574435157738448
 *  0.8979741693231866
 *  0.11949032184355113
 *  0.23425519545397544
 *  Average = 0.4135635532219763
 *  Min     = 0.09574435157738448
 *  Max     = 0.8979741693231866
 *
 *  % java StandardDeviation
 *  0.25523821773554134
 *  0.6577131932424987
 *  0.14170223533941984
 *  0.2653444869526621
 *  0.895374957216799
 *  Average = 0.44307461809738424
 *  Min     = 0.14170223533941984
 *  Max     = 0.895374957216799
 *
 ******************************************************************************/


public class StandardDeviation {
    public static void main(String[] args) {

        int n = 5;
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();

        // print 5 values
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        double sum = a + b + c + d + e;

        // compute stats
        double average = sum / n;
        double min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
        double max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));

        // compute SD

        double sumDiffSquared = Math.pow((a - average), 2) + Math.pow((b - average), 2) + Math
                .pow((c - average), 2) + Math.pow((d - average), 2) + Math.pow((e - average), 2);

        double variance = sumDiffSquared / n;

        double standDev = Math.sqrt(variance);

        System.out.println("Average = " + average);
        System.out.println("Max = " + min);
        System.out.println("Min = " + max);
        System.out.println("Standard Deviation = " + standDev);


    }
}
