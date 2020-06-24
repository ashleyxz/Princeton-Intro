/******************************************************************************
 *  Compilation:  javac WeatherBallon.java
 *  Execution:    java WeatherBallon
 *
 *  (Etter and Ingber, p. 123)
 *  Suppose that h(t) = 0.12t4 + 12t3 - 380t2 + 4100t + 220
 *  represents the height of a weather balloon at time t (measured in hours)
 *  for the first 48 hours after its launch.
 *  Create a table of the height at time t for t = 0 to 48.
 *  What is its maximum height? Solution: t = 5.
 ******************************************************************************/

public class WeatherBallon {
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);
        double height = 0.12 * Math.pow(t, 4) + 12 * Math.pow(t, 3) - 380 * Math.pow(t, 2)
                + 4100 * t + 220;


        System.out.println(height);
    }
}

