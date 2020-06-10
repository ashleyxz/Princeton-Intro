/******************************************************************************
 *  Compilation:  javac BMI.java
 *  Execution:    java BMI w h
 *
 The body mass index (BMI) is the ratio of the weight of a person (in kilograms)
 to the square of the height (in meters).
 Write a program BMI.java
 that takes two command-line arguments, weight and height, and prints the BMI.
 ******************************************************************************/

public class BMI {
    public static void main(String[] args) {
        double w = Double.parseDouble(args[0]);
        double h = Double.parseDouble(args[1]);

        double BMI = w / Math.pow(h, 2);
        System.out.println("BMI = " + BMI);

    }
}
