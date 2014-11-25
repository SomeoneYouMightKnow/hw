import java.util.*;
import java.io.*;

public class WordSearch {
    private Random r = new Random();
    private char[][] board; //empty board is filled with null chars
    private ArrayList<String> wordlist, words;
    private char[][] key;

    public WordSearch( int r, int c ) {
	board = new char[r][c];
	for (int i = 0; i < r; i++) {
	    for (int j = 0; j < c; j++) {
		board[i][j] = '.';
	    }
	}

	Scanner sc = null;
	try {
	    sc = new Scanner(new File("words.txt"));
	} catch (Exception e) {
	    System.out.println("Can't open file");
	    System.exit(0);
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

    public String getKey() {
	String s = "";
	for (int i = 0; i < key.length; i++) {
	    for (int j = 0; j < key[i].length; j++) {
		s = s + key[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
	

    public void addWordH( String w, int row, int col) {
	int c = col;
	boolean overlap = false;
	for (int i = 0; i < w.length(); i++) {
	    if (!(board[row][c] == '.')) {
		overlap = true;
	    }
	    int l = i;
	    if (overlap){
		for (int j = c; j < w.length() - l; j++) {
		    if (board[row][j+1] == w.charAt(l)) {

		    }
		    l++;
		}
	    }
	    c++;
	}
    
	for (int i = 0; i < w.length(); i++) {
	    board[row][c] = w.charAt(i); //replaces any letters already there
	    c++; //could go out of bounds
	}
    }

    public void makeKey() {
	key = new char[board.length][board[0].length];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		kay[i][j] = board[i][j];
	    }
	}

    }

    public void buildPuzzle(int numwords) {
	words = new ArrayList<String>();
	int i = 0;
	while (i<numwords) {
	    int wordIndex = rnd.nextInt(wordlist.size());
	    String word = wordList.get(wordIndex);
	    if (addWord(word)) {
		words.add(word);
		wordList.remove(wordIndex);
	    }
	    i++;
	}
	makeKey();
    }

    public String getWords(){
	return ""+words;
    }
    
}
