import java.util.Scanner
public class Maze {

    private int length;

    public Maze() {
	Scanner user = new Scanner(System.in);
	length = user.nextInt();
	for (int i = 0; i < length*2+1; i++) {
	    System.out.println("*");
	}
	for (int i = 0; i < length; i++) {
	    for (int j = 0; j < length*2+1; i++) {
		if (i%2 == 0) {
		    System.out.println("*");
		}
	    }
	}
	for (int i = 0; i < length*2+1; i++) {
	    System.out.println("*");
	}

    }
}
