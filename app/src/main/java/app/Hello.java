package app;
import java.util.*;

class Hello {
    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );
        int num1 = Integer.parseInt( scan.nextLine() );
        int num2 = Integer.parseInt( scan.nextLine() );
        System.out.println( "The sum is: " + ( num1 + num2 ) );
    }
}