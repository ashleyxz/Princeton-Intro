/******************************************************************************
 *  Compilation:  javac FibonacciWord.java
 *  Execution:    java FibonacciWord n
 *
 *  Prints the Fibonacci word of f(n) = f(n-1) followed by f(n-2).
 *
 *  % java FibonacciWord 3
 *  01001
 *  % java FibonacciWord 4
 *  01001010
 *
 ******************************************************************************/


// There two variables wordN, wordN_1 for S(n) and S(n-1)
//         There a variable temp for exchanging values
//         Loop N times
//         Return the last value
//

public class FibonacciWord {
    public static void main(String[] args) {

        String wordN = "a";
        String wordN_1 = "b";
        String temp;

        for (int i = 2; i <= 10; i++)
            temp = wordN;
        wordN += wordN_1;
        wordN_1 = temp;

        System.out.println("f(10) ="); //division by zero


    }
}
