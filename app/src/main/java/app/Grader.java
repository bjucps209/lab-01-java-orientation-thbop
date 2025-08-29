package app;
import java.util.*;

public class Grader {
    public static void main( String[] args ) {
        var handler = new GradeHandler();
        handler.scan();
    }
}

class GradeHandler {
    private int
        FAILING_GRADE        = 38,
        ROUND_INTERVAL       = 5,
        ROUND_MAX_DIFFERENCE = 2;
    
    void scan() {
        var scan = new Scanner( System.in );
        int studentCount = getNextInt( scan );

        for ( int i = 0; i < studentCount; i++ ) {
            System.out.println( processGrade( getNextInt( scan ) ) );
        }
        
        scan.close();
    }

    private int getNextInt( Scanner scan ) {
        return Integer.parseInt( scan.nextLine() );
    }

    private int processGrade( int grade ) {
        if ( grade < FAILING_GRADE )
            return grade;
        
        if ( ROUND_INTERVAL - ( grade % ROUND_INTERVAL ) <= ROUND_MAX_DIFFERENCE )
            return grade - ( grade % ROUND_INTERVAL ) + ROUND_INTERVAL;

        return grade;

    }
}