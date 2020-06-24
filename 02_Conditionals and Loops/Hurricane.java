/******************************************************************************
 *  Compilation:  javac Hurricane.java
 *  Execution:    java Hurricane N
 *
 *  Reads in the wind speed (in miles per hour) and reports whether it is
 *  a hurricane, and if so, whether it is Class 1, 2, 3, 4 or 5 according
 *  to the Saffir-Simpson scale.
 *
 *  Reference: http://www.marinewaypoints.com/marine/wind.shtml
 *
 *  % java Hurricane 25
 *  Not a hurricane
 *
 *  % java Hurricane 135
 *  Class 4 hurricane
 *
 ******************************************************************************/

public class Hurricane {
    public static void main(String[] args) {

        int wind = Integer.parseInt(args[0]);

        if (wind < 75)
            System.out.println("Not a hurricane");

        else if (wind <= 95)
            System.out.println("Category 1 hurricane");
        else if (wind <= 110)
            System.out.println("Category 2 hurricane");
        else if (wind <= 130)
            System.out.println("Category 3 hurricane");
        else if (wind <= 155)
            System.out.println("Category 4 hurricane");
        else
            System.out.println("Category 5 hurricane");


    }
}
