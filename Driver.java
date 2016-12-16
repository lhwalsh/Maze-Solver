import java.util.Scanner;

public class Driver {
	public static void main(String args[]) throws Exception {
		System.out.println( "Word Brain Solver" );
		System.out.print( "Enter size of maze: " );
		Scanner input = new Scanner( System.in );
		int size = input.nextInt();

		Maze maze = new Maze( size );

		getMaze( maze );
	}

	public static void getMaze( Maze maze ) throws Exception {
		char input = 0; // Initialize as null

		for ( int i = 0; i < maze.getLength(); i++ ) {
			for ( int j = 0; j < maze.getLength(); j++ ) {
				System.out.print(String.format("\033[H\033[2J")); // Clears screen

				System.out.println( maze );
				System.out.print( "Enter next char( press enter if empty ): " );
				input = ( char ) System.in.read();
				maze.set( i, j, input );
			}
		}
	}
}

