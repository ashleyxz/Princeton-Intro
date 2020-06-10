/******************************************************************************
 *  Compilation:  javac CMYKToRGBColorMatching.java
 *  Execution:    java CMYKToRGBColorMatching C M Y K
 *
 * Write a program CMYKtoRGB that reads in four command line
 * inputs C, M, Y, and K between 0 and 1,
 * and prints the corresponding RGB parameters.
 * Devise the appropriate formula by "inverting" the RGB to CMYK conversion formula.
 *
 *  %  java CMYKToRGBColorMatching C M Y K
 *
 ******************************************************************************/

/*The R,G,B values are given in the range of 0..255.

        The red (R) color is calculated from the cyan (C) and black (K) colors:

        R = 255 × (1-C) × (1-K)

        The green color (G) is calculated from the magenta (M) and black (K) colors:

        G = 255 × (1-M) × (1-K)

        The blue color (B) is calculated from the yellow (Y) and black (K) colors:

        B = 255 × (1-Y) × (1-K)
        */

public class CMYKToRGBColorMatching {
    public static void main(String[] args) {

        double C = Double.parseDouble(args[0]);
        double M = Double.parseDouble(args[1]);
        double Y = Double.parseDouble(args[2]);
        double K = Double.parseDouble(args[3]);

        double R = 255 * (1 - C) * (1 - K);
        double G = 255 * (1 - M) * (1 - K);
        double B = 255 * (1 - Y) * (1 - K);

        System.out.println("CMYK: " + C + ", " + M + ", " + Y + ", " + K);
        System.out.println("RGB: " + R + ", " + G + ", " + B);


    }
}
