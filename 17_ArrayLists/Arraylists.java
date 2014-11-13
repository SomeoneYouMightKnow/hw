import java.util.*;

public class Arraylists {
    Random rnd = new Random();
    
    //Randomize ArrayList<Integer> of consecutive integers.

    ArrayList<Integer> ai = new ArrayList<Integer>();

    for ( int i = 0 ; i < 100 ; i++) {
	ai.add(i);
    }

    public void swap(int indexA, int indexB){
	int safe = ai.get(indexA);
	ai.set(indexA, ai.get(indexB));
    }
    
    //0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    public void scramble() {
	int thingOne;
	int thingTwo;
        int i = rnd.nextInt(ai.size()) ; //
	while (????){
	    //????????????????????????
       
	}

	    i = rnd.nextInt(ai.size());
    }


    public static void main( String[] args ) {
	System.out.println(ai);
	ai.scramble();
	System.out.println(ai);


    }
    
}
