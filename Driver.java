import java.util.Scanner;

public class Driver {

    private static String tempWord;
    private static int position;

	public static void main(String args[]) throws Exception {
		System.out.print(String.format("\033[H\033[2J")); // Clears screen

		System.out.println( "Word Brain Solver" );
		System.out.print( "Enter size of maze: " );
		Scanner input = new Scanner( System.in );
		int size = input.nextInt();

		Maze maze = new Maze( size );

		getMaze( maze );

		System.out.print( "Enter size of word: " );
		int wordSize = input.nextInt();
	    	//findWords(wordSize);

	}

	private static void findWords(int wordSize) {
	    tempWord = "";
	    for (int y = 0; y < maze.getLength(); y++) {
		for (int x = 0; x < maze.getLength(); x++) {
		    position = (y * 10) + x;
		    while (/*need to enter condition that makes sure all paths have been tested*/) {
			if (tempWord == wordSize - 1) {
			    while (available()) {
				testWords();
			    }
			    goBackOne();
			} else {
			    if (available) {
				goForwardOne();
			    } else {
				goBackOne();
			    }
			}
		    }
		}
	    }
	}

	private static void goBackOne() {
	    tempWord = tempWord.substring(0, tempWord.length-1);
	    position = findParent();
	}

	private static void next() {
	    int parent = findParent();
	    boolean left = true;
	    boolean right = true;
	    boolean top = true;
	    boolean bottom = true;
	    if (position/10 - 1 < 0) {
	    } else if (position/10 + 1 >= maze.getLength()) {
	    }
	    if (position%10 - 1 < 0) {
	    } else if (position%10 + 1 >= maze.getLength()) {
	    }
	}

	private static void testWords() {
	    /*int positionHolder;
	    String wordHolder
	    while (available()) {
		positionHolder = next();
		wordHolder = tempWord + maze.getChar(positionHolder/10, positionHolder%10);
		if (valid(wordHolder))
		    System.out.println(wordHolder);
	    }*/
	    //need to make it work without marking anything, since the parent being marked makes things hard
	    //that means I can't use the next method
	}

	private static boolean available() {
	    /*if (next() == -1) {
		return false;
	    }
	    return true;*/
	    //won't work since next returns nothing
	}

	public static void getMaze( Maze maze ) throws Exception {
		char input = 0; // Initialize as null
		Scanner reader = new Scanner( System.in );

		for ( int i = 0; i < maze.getLength(); i++ ) {
			for ( int j = 0; j < maze.getLength(); j++ ) {
				System.out.print(String.format("\033[H\033[2J")); // Clears screen

				maze.setChar( i, j, '*' );
				System.out.println( maze );
				System.out.print( "Enter next letter( press enter if empty ): " );
				String tmpString = reader.nextLine();
				if ( tmpString.isEmpty() ) {
					input = 0;
				} else {
					input = tmpString.toUpperCase().charAt( 0 );
				}
				maze.setChar( i, j, input );
			}
		}

		System.out.print(String.format("\033[H\033[2J")); // Clears screen
		System.out.println( maze );

	}
}

