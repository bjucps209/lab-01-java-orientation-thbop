package app;

import java.util.*;

public class Guess {
    public static void main( String[] args ) {
        var game = new Game();
        game.run();
    }
}

class Game {
    private int secretNumber;
    private int guessCount = 0;
    private int guess = 0;


    public Game() {
        secretNumber = (int)(Math.random() * 9) + 1;
    }

    void run() {
        var scan = new Scanner( System.in );
        while ( guess != secretNumber ) {
            guess = Integer.parseInt( scan.nextLine() );
            guessCount++;

            // Feedback
            if ( guess < secretNumber )
                System.out.println( "Your guess is too low." );
            else if ( guess > secretNumber )
                System.out.println( "Your guess is too high." );
            else
                System.out.println( "You got it!!" );
        }
        scan.close();

        System.out.println( "It took you " + guessCount + " guesses." );
    }
}
