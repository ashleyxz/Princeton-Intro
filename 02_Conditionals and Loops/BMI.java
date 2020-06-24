/******************************************************************************
 *  Compilation:  javac BMI.java
 *  Execution:    java BMI w h
 *
 The body mass index (BMI) is the ratio of
 the weight of a person (in kilograms) to the square of the height (in meters).
 Write a program BMI.java that takes two command-line arguments,
 weight and height,
 computes the BMI, and prints the corresponding BMI category:
 Starvation: less than 15
 Anorexic: less than 17.5
 Underweight: less than 18.5
 Ideal: greater than or equal to 18.5 but less than 25
 Overweight: greater than or equal to 25 but less than 30
 Obese: greater than or equal to 30 but less than 40
 Morbidly Obese: greater than or equal to 40
 ******************************************************************************/

public class BMI {
    public static void main(String[] args) {

        double h = Double.parseDouble(args[0]);
        double w = Double.parseDouble(args[1]);

        double bodyMassIndex = w / Math.pow(h, 2);

        if (bodyMassIndex < 15)
            System.out.println(
                    "One with the height of " + h + " and " + "the weight of " + w
                            + " is Starvation.");

        else if (bodyMassIndex < 17.5)
            System.out.println(
                    "One with the height of " + h + " and " + "the weight of " + w
                            + " is Anorexic.");

        else if (bodyMassIndex < 18.5)
            System.out.println(
                    "One with the height of " + h + " and " + "the weight of " + w
                            + " is Underweight.");

        else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25)
            System.out.println(
                    "One with the height of " + h + " and " + "the weight of " + w + " is Ideal.");

        else if (bodyMassIndex >= 25 && bodyMassIndex < 30)
            System.out.println(
                    "One with the height of " + h + " and " + "the weight of " + w
                            + " is Overweight.");

        else if (bodyMassIndex >= 30 && bodyMassIndex < 40)
            System.out.println(
                    "One with the height of " + h + " and " + "the weight of " + w + " is Obese.");

        else
            System.out.println(
                    "One with the height of " + h + " and " + "the weight of " + w
                            + " is Morbidly Obese.");
    }
}

