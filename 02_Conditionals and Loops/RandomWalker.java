/******************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker n
 *
 *  Simulates how long it takes n random walkers starting at the center
 *  of an n-by-n grid to visit every cell in the grid.
 *
 *
 *
 * A Java programmer begins walking aimlessly.
 * At each time step, she takes one step in a random direction
 * (either north, east, south, or west),
 * each with probability 25%.
 * She stops once she is at Manhattan distance r from the starting point.
 * How many steps will the random walker take?
 * This process is known as a two-dimensional random walk.
 *
 * Write a program RandomWalker.java that
 * takes an integer command-line argument r
 * and simulates the motion of a random walk
 * until the random walker is at Manhattan distance r from the starting point.
 * Print the coordinates at each step of the walk
 * (including the starting and ending points),
 * treating the starting point as (0, 0).
 * Also, print the total number of steps taken.
 ******************************************************************************/

public class RandomWalker {
    public static void main(String[] args) {

        // command-line argument // Maximum Manhattan distance from origin
        int r = Integer.parseInt(args[0]);

        int x = 0, y = 0; // initial position of the walker
        int steps = 0;


        while (Math.abs(x) + Math.abs(y) <= r) {

            double move = Math.random();

            if (move < 0.25) x++;
            else if (move < 0.50) x--;
            else if (move < 0.75) y++;
            else if (move < 1.00) y--;


            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("steps = " + steps);
    }
}

    /*
   int r = Integer.parseInt(args[0]);      // Maximum Manhattan distance from origin

    int x = 0;
	int y = 0;
    Random rand = new Random();
    int randomDirection;
    int steps = 0;
	    while ((Math.abs(x) + Math.abs(y)) < r) {
	            */
/*
	            We're generating a random number in [0,3] inclusive interval
	            We're coding the directions the following way:
	                0 - North (y + 1)
	                1 - South (y - 1)
	                2 - West (x -1)
	                3 - East (x + 1)
	        */    /*

        randomDirection = rand.nextInt(4);

        switch (randomDirection) {
        case 0: // North
        y += 1;
        break;
        case 1: // South
        y -= 1;
        break;
        case 2: // West
        x += 1;
        break;
        case 3: // East
        x -= 1;
        }

        steps++;    */
