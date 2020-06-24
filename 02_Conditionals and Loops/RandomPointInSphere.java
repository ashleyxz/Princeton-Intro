/******************************************************************************
 *  Compilation:  javac RandomPointInSphere.java
 *  Execution:    java RandomPointInSphere n
 *
 *  Write a program to print the (x, y, z) coordinates of a random point
 *  on the surface of a sphere.
 *  Use Marsaglia' method:
 *  pick a random point (a, b) in the unit circle as in the do-while example.
 *  Then, set x = 2a sqrt(1 - a^2 - b^2), y = 2b sqrt(1 - a^2 - b^2),
 *  z = 1 - 2(a^2 + b^2).
 *
 *
 *
 *  % java RandomSpherePoint
 ******************************************************************************/

public class RandomPointInSphere {
    public static void main(String[] args) {

        double a, b;
        do {
            // Scale a and b to be random in (-1,1).
            a = 2.0 * Math.random() - 1.0;
            b = 2.0 * Math.random() - 1.0;
        } while (Math.sqrt(a * a + b * b) > 1.0);

        double x, y, z;

        x = 2.0 * a * Math.sqrt(1.0 - Math.pow(a, 2) - Math.pow(b, 2));
        y = 2.0 * b * Math.sqrt(1.0 - Math.pow(a, 2) - Math.pow(b, 2));
        z = 1.0 - 2.0 * (Math.pow(a, 2) - Math.pow(b, 2));

        //print (x, y, z)

        System.out.println("(" + x + "," + y + "," + z + ")");
    }
}
