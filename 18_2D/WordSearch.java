public class WordSearch {

    private char[][] board; //empty board is filled with null chars

    public WordSearch( int r, int c ) {
	board = new char[r][c];
	for (int i = 0; i < r; i++) {
	    for (int j = 0; j < c; j++) {
		board[i][j] = '.';
	    }
	}
    }

    public WordSearch() {
	this( 20 , 40 );
    }

    public String toString() {
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public void addWordH( String w, int row, int col) {
		boolean overlap = false;
		for (int i = col; i < col + w.length() - 1; i++) {
			if (board[row][i] != '.') {
				overlap = true;
	    }
	}
	if (!overlap){
		for (int j = 0; j < w.length() - l; j++) {
			if (board[row][j+col] == w.charAt(j)) {
				
			}
		    l++;
		}
	    }
	}

/*
    
	for (int i = 0; i < w.length(); i++) {
	    board[row][c] = w.charAt(i); //replaces any letters already there
	    c++; //could go out of bounds
	}
	*/
    }

    
}
