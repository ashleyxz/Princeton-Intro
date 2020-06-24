/******************************************************************************
 *  Compilation:  javac WindChillModifed.java
 *  Execution:    java WindChillModifed n
 *
 *  The wind chill formula from Exercise 1.2.14 is only valid
 *  if the wind speed is above 3MPH and below 110MPH
 *  and the temperature is below 50 degrees Fahrenheit and above -50 degrees.
 *  Modify your solution to print an error message
 *  if the user types in a value outside the allowable range.
 *
 *
 *  % java WindChillModifed
 ******************************************************************************/

/******************************************************************************
 *  Compilation:  javac WindChill.java
 *  Execution:    java WindChill t v
 *
 *  Given the temperature t (in Fahrenheit) and the wind speed v
 *  (in miles per hour), compute the wind chill w using the formula
 *  from the National Weather Service.
 *
 *     w = 35.74 + 0.6215*t + (0.4275*t - 35.75)  *  v ^ 0.16
 *
 *  Reference:  http://www.nws.noaa.gov/om/windchill/index.shtml
 *
 ******************************************************************************/

/*

public class WindChill {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);

        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);


        // System.out.println("Wind chill of " + t + " Fahrenheit and the wind speed " + v +
        //                            " miles per hour is " + w + ".");

        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w);

    }
}
*/

public class WindChillModifed {
    public static void main(String[] args) {

        double t = Double.parseDouble(args[0]); // temperature, F
        double v = Double.parseDouble(args[1]); // wind speed, mph

        if (v > 3 && v < 110 && t > -50 && t < 50) {

            //the wind speed is above 3MPH and below 110MPH
            //the temperature is below 50 degrees Fahrenheit and above -50 degrees.

            double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math
                    .pow(v, 0.16); // formula valid if


            System.out.println(
                    "Temperature = " + t + ", " + "Wind speed  = " + v + ", " + "Wind chill  = "
                            + w);


        }
        else
            System.out.println("The formula used by this program is not valid" +
                                       " for temperature lower than -50 F and" +
                                       " higher than 50 F" +
                                       " and wind speed larger than 110 mph" +
                                       " or smaller than 3 mph.");

    }
}
