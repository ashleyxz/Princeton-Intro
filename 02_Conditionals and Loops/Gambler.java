/******************************************************************************
 *  Compilation:  javac Gambler.java
 *  Execution:    java Gambler stake goal N
 *
 *  Gambler's ruin.
 *  gambler's ruinSuppose a gambler makes a series of fair $1 bets,
 *  starting with $50, and continue to play until she either goes broke or has $250.
 *  What are the chances that she will go home with $250,
 *  and how many bets might she expect to make before winning or losing?
 *  Gambler.java is a simulation that can help answer these questions.
 *  It takes three command-line arguments,
 *  the initial stake ($50),
 *  the goal amount ($250),
 *  and the number of times we want to simulate the game.
 *
 *  Simulates a gambler who start with $stake and place fair $1 bets
 *  until she goes broke or reach $goal. Keeps track of the number of
 *  times she wins and the number of bets she makes. Run the experiment N
 *  times, averages the results, and prints them out.
 *
 *  % java Gambler 50 250 1000
 *  178 wins of 1000
 *  Percent of games won = 17.8
 *  Avg # bets           = 10010.79
 *
 *  % java Gambler 50 150 1000
 *  337 wins of 1000
 *  Percent of games won = 33.7
 *  Avg # bets           = 4863.95
 *
 *  % java Gambler 50 100 1000
 *  503 wins of 1000
 *  Percent of games won = 50.3
 *  Avg # bets           = 2464.59
 *
 ******************************************************************************/

public class Gambler {
    public static void main(String[] args) {

        // command-line argument
        int stake = Integer.parseInt(args[0]); // gambler's starting bankroll
        int goal = Integer.parseInt(args[0]); // gambler's desired bankroll
        int trials = Integer.parseInt(args[0]); // number of trials to perform

        int bets = 0; // total number of bets made
        int wins = 0; // total number of games won

        // repeat trials times
        for (int t = 0; t < trials; t++) {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++; // win $1
                else cash--; // lose $1
            }
            if (cash == goal) wins++; // did gambler go achieve desired goal?
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);

    }
}
