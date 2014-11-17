import java.util.*;

public class Arraylists {
    Random rnd = new Random();
    
    //Randomize ArrayList<Integer> of consecutive integers.

    ArrayList<Integer> ai = new ArrayList<Integer>();

    for ( int i = 0 ; i < 100 ; i++) {
	ai.add(i);
    }

    
    public ArrayList<Integer> shuffle1() {
	ArrayList<Integer> result = new ArrayList<Integer>();
        while (ai.size()>0) {
	    int i = rnd.nextInt(ai.size());
	    int v = ai.remove(i);
	    result.add(v); //hidden complexity. remove() and add() loop through the ArrayList, "behind the scenes"
	}
	return result; //Creates new ArrayList, uses more space, Might be undesirable
    }

    public ArrayList<Integer> shuffle2() {
	ArrayList<Integer> result = new ArrayList<Integer>();
	for (int s = ai.size(); s > 0; s--) {
	    int i = rnd.nextInt(s);
	    int v = ai.remove(i);
	    ai.add(v);	//move the int at a random index to the end.
	}
	return result;
	//Slower, saves space, loses original ArrayList
    }

    public ArrayList<Integer> shuffle3() {
	ArrayList<Integer> result = new ArrayList<Integer>();
	for (int s = ai.size(); s > 0; s--) {
	    int i = rnd.nextInt(s);

	    int temp = ai.get(i);
	    ai.set( i , ai.get(s));
	    ai.set( s , temp );


	}
    }
    

    public static void main( String[] args ) {
	System.out.println(ai);
	ai.scramble();
	System.out.println(ai);


    }
    
}
