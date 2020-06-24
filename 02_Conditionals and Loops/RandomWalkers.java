/* *****************************************************************************
 *  Compilation: javac RandomWalkers.java
 *  Execution: java RandomWalkers r trials
 *
 *  Purpose: This program takes two integer command-line arguments r and trials.
 *  In each of trials independent experiments, simulate a random walk until the
 *  random walker is at Manhattan distance r from the starting point. Print the
 *  average number of steps.
 *
 *  % java RandomWalkers 5 1000000
 *  average number of steps = 14.967998
 *
 *  % java RandomWalkers 10 100000
 *  average number of steps = 59.16106
 *
 *  % java RandomWalkers 80 100000
 *  average number of steps = 3757.45922
 **************************************************************************** */

/*
public class RandomWalkers {
    public static void main(String[] args) {

        // command-line argument
        int r = Integer.parseInt(args[0]); // Maximum Manhattan distance from origin
        int trials = Integer.parseInt(args[1]); // Number of times the simulations should run

        //  total squared distance is initialized to 0
        double totalSquaredDistance = 0.0;

        for (int i = 0; i < trials; i++) {
            int x = 0, y = 0; // every time we begin a trial we start from the origin (0, 0)
            int steps
                    = 0; // steps = 0 - no we DO NOT zero the steps out, let that cumulate over every trial so we can get the average of all trials this wa

            while (Math.abs(x) < r && Math.abs(y) < r) {

                double move = Math.random();

                if (move < 0.25) x++;
                else if (move < 0.50) x--;
                else if (move < 0.75) y++;
                else if (move < 1.00) y--;

                steps++;
            }

            //  calculates the squared distance from the walker's original
            int squaredDistance = x * x + y * y;
            //  adds squared distance of the current simmulation to the total
            totalSquaredDistance += squaredDistance;

        }

        //  calculates mean squared distance
        double averageSquaredDistance = totalSquaredDistance / trials;

        //  final output of calculated mean squared distance
        System.out.println("average number of steps = " + averageSquaredDistance);
    }
}

*/
public class RandomWalkers {
    private static int randomWalker(int mht) {
        int steps = 0;
        int x = 0;
        int y = 0;

        while (Math.abs(x) + Math.abs(y) != mht) {
            //            System.out.printf("(%d, %d)\n", x, y);
            int rand = (int) (Math.random() * 4);
            if (rand == 0) x += 1;
            if (rand == 1) x -= 1;
            if (rand == 2) y += 1;
            if (rand == 3) y -= 1;
            steps++;
        }
        //        System.out.printf("(%d, %d)\n", x, y);
        //        System.out.println("steps = " + steps);
        return steps;
    }

    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int totalSteps = 0;
        for (int i = 0; i < trials; i++) {
            totalSteps += randomWalker(r);
        }
        System.out.println("average number of steps = " + (double) totalSteps / trials);


    }
}
