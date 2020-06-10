/******************************************************************************
 *  Compilation:  javac RGBToYIQ.java
 *  Execution:    java RGBToYIQ a b c
 *
 * Write a program RGBtoYIQ.javathat takes an RGB color
 * (three integers between 0 and 255)
 * and transforms it to a YIQ color
 * (three different real numbers Y, I, and Q, with 0 ≤ Y ≤ 1, –0.5957 ≤ I ≤ 0.5957, and –0.5226 ≤ Q ≤ 0.5226).
 * Write a program YIQtoRGB.java that applies the inverse transformation.
 *
 *  %  java RGBToYIQ a b c
 *
 ******************************************************************************/


public class RGBToYIQ {
    public static void main(String[] args) {

        int R = Integer.parseInt(args[0]);
        int G = Integer.parseInt(args[1]);
        int B = Integer.parseInt(args[2]);

        double Y = (0.299 * R + 0.587 * G + 0.114 * B) / 255;
        double I = (0.596 * R - 0.275 * G - 0.321 * B) / 255;
        double Q = (0.212 * R - 0.523 * G + 0.311 * B) / 255;

        System.out.println("RGB: " + R + ", " + G + ", " + B);
        System.out.println("YIQ: " + Y + ", " + I + ", " + Q);


    }
}
