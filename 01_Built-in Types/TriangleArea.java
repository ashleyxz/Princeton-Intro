/******************************************************************************
 *  Compilation:  javac TriangleArea.java
 *  Execution:    java TriangleArea a b c
 *
 Write a program TriangleArea.java that takes three command line inputs a, b, and c,
 representing the side lengths of a triangle,
 and prints the area of the triangle
 using Heron's formula: area = sqrt(s(s-a)(s-b)(s-c)),
 where s = (a + b + c) / 2.
 *
 *  % java TriangleArea
 ******************************************************************************/

public class TriangleArea {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println(area);

    }
}
