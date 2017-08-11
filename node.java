public class node {

    boolean selected;
    char letter;

    public node() {
	letter = 32;;
	selected = false;
    }

    public char getChar() {
	return letter;
    }

    public boolean isSelected() {
	return selected;
    }

    public void setChar(char letter) {
	this.letter = letter;
    }

    public void setSelected(boolean selected) {
	this.selected = selected;
    }

    public String toString() {
	return letter + " " + selected;
    }
}
