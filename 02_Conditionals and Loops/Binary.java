/******************************************************************************
 *  Compilation:  javac Binary.java
 *  Execution:    java Binary n
 *
 *  Number conversion. Binary.java prints the binary (base 2) representation
 *  of the decimal number typed as the command-line argument.
 *  It is based on decomposing the number into a sum of powers of 2.
 *  For example, the binary representation of 106 is 1101010,
 *  which is the same as saying that 106 = 64 + 32 + 8 + 2.
 *  To compute the binary representation of n,
 *  we consider the powers of 2 less than or equal to n
 *  in decreasing order to determine which belong in the binary decomposition
 *  (and therefore correspond to a 1 bit in the binary representation).
 *
 *  Prints out n in binary.
 *
 *  % java Binary 5
 *  101
 *
 *  % java Binary 106
 *  1101010
 *
 *  % java Binary 0
 *  0
 *
 *  % java Binary 16
 *  10000
 *
 *  Limitations
 *  -----------
 *  Does not handle negative integers.
 *
 *  Remarks
 *  -------
 *  could use Integer.toBinaryString(N) instead.
 *
 ******************************************************************************/

public class Binary {
    public static void main(String[] args) {

        // command-line argument
        int n = Integer.parseInt(args[0]);

        //set power to the largest power of 2 that is <=n
        int power = 1;
        while (power <= n / 2) {
            power *= 2;
        }

        //check for presence of power of 2 in n, from largest to smallest
        while (power > 0) {
            if (n < power) {
                System.out.print(0);
            }

            //power is present in n, so subtract power from n
            else {
                System.out.print(1);
                n -= power;
            }

            //next smallest power of 2
            power /= 2;
        }
        System.out.println();
    }
}
