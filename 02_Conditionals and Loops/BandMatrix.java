public class BandMatrix {
    public static void main(String[] args) {

        /*
        Hint 1: Do not use arrays.

        Hint 2: Devise an expression that determines the distance of element (i, j) from the main diagonal.
        For reference, the following diagram illustrates the distance of each element in an 8-by-8 matrix.
        Solution to hint.

                Math.abs(i - j)
        */


        // command-line argument
        int n = Integer.parseInt(args[0]); // dimension of the matrix
        int width = Integer.parseInt(args[1]);  // the range (or max distance)

        for (int row = 0; row < n; row++) { //the loop for the row
            for (int column = 0; column < n; column++) { // the loop for the columns
                if (Math.abs(row - column)
                        <= width) {  // if the column index is in the "width" range of the row index then...
                    System.out.print("*  "); //...we print a * character...
                }
                else {
                    System.out.print("0  "); // ...otherwise a 0
                }
            }

            // ...and new line after each finished row
            System.out.println();

        }
    }
}
