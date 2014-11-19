public class Driver {

    public static void main(String[] args) {
	WordSearch w;

	
	if (args.length == 2) {
	    int rows = Integer.parseInt(args[0]);
	    int cols = Integer.parseInt(args[1]);
	    w = new WordSearch(rows, cols);
	}
	else {
	    if (args.length != 0) {
		System.out.println("No");
		System.exit(0);
	    }
	    w = new WordSearch();
	}
	
	
	//System.out.println(w);
	w.addWordH("hello", 10, 10);
	System.out.println(w);
	/*
	w.addWordH("look", 10, 12); //test illegal overlap
	System.out.println(w);
	w.addWordH("look", 10, 13); //test legal overlap
	System.out.println(w);
	w.addWordH("look", -3, 12); //test illegal row
	System.out.println(w);
	w.addWordH("look", 10, 37); //test illegal col
	System.out.println(w);
	*/
    }


}
