public class Shapes {
    public String box( int a, int b) {
	int height = a;
	int width = b;
	String s = "";
	while (height > 0) {
	    while (width > 0) {
		s = s + "*";
		width = width - 1;
	    }
	    s = s + "\n";
	    width = b;
	    height = height - 1;
	}
        return s;
    }

    public String tri1(int a) {
	int rowcounter = 1;
	int starcounter = 1;
	String output = "";
	while (rowcounter < a) {
	    while (starcounter > 0) {
		output = output + "*";
		starcounter = starcounter - 1;
	    }
	    output = output + "\n";
	    rowcounter = rowcounter + 1;
	    starcounter = rowcounter;
	}
	return output;
    }
    
    public String tri2(int a) {
	int rowcounter = 1;
	int starcounter = 1;
	int spacecounter = a - 1;
	String output = "";
	while (rowcounter < a) {
	    while (spacecounter > 1) {
		output = output + " ";
		spacecounter = spacecounter - 1;
	    }
	    while (starcounter > 0) {
		output = output + "*";
		starcounter = starcounter - 1;
	    }
	    output = output + "\n";
	    rowcounter = rowcounter + 1;
	    starcounter = rowcounter;
	    spacecounter = a - starcounter;
	}
	return output;
    }

    public String tri3(int a) {
	int rowcounter;
	int starcounter;
	int spacecounter;
	String output="";
	// For row n, there are 1 + 2(n-1) stars
	// For row n, there are a - n
	for(rowcounter=0;rowcounter=a;rowcounter--){
	    for(spacecounter=a-1;spacecounter=0;spacecounter--){

	    }	
	    for(starcounter=1;starcounter=1+2*(rowcounter


	    
	}

}
