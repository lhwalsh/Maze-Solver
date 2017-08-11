public class Maze {

    private int length;
    private node[][] maze;

    public Maze(int length) {
	this.length = length;
	maze = new node[length][length];
	for (int i = 0; i < maze.length; i++) {
	    for (int j = 0; j < maze[i].length; j++) {
		maze[i][j] = new node();
	    }
	}
    }

    public int getLength() {
	return length;
    }

    public void setChar(int x, int y, char z) {
	maze[x][y].setChar(z);
    }

    public void setSelected(int x, int y, boolean z) {
	maze[x][y].setSelected(z);
    }

    public char getChar(int x, int y) {
	return maze[x][y].getChar();
    }

    public boolean isSelected(int x, int y) {
	return maze[x][y].isSelected();
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
		        if (maze[x][y].getChar() == 0) {
			    answer += " ";
			} else {
			    answer += maze[x][y].getChar();
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
