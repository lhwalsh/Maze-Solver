public class Maze {

    private int length;
    private char[][] maze;

    public Maze(int length) {
	this.length = length;
	maze = new char[length][length];
    }

    public int getLength() {
	return length;
    }

    public void set(int x, int y, char z) {
	maze[x][y] = z;
    }

    public String toString() {
	String answer = "";
	int x = 0;
	int y = 0;
	for (int i = 0; i < length*2+1; i++) {
	    if (i%2 == 0) {
		for (int j = 0; j < length*2+1; j++) {
		    answer += "-";
		}
	    } else {
		for (int j = 0; j < length*2+1; j++) {
		    if (j%2 == 0) {
			answer += "|";
		    } else {
		        if (maze[x][y] == 0) {
			    answer += " ";
			} else {
			    answer += maze[x][y];
			}
			y++;
		    }
		}
		x++;
	    }
	    y = 0;
	    answer += "\n";
	}
	return answer;
    }

}
