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
	int rowcount = 1;
	int starcount = 1;
	String output = "";
	while (rowcount < a) {
	    while (starcount > 0) {
		output = output + "*";
		starcount = starcount - 1;
	    }
	    output = output + "\n";
	    rowcount = rowcount + 1;
	    starcount = rowcount;
	}
	return output;
    }
    
    public String tri2(int a) {
	int rowcount = 1;
	int starcount = 1;
	int spacecount = a - 1;
	String output = "";
	while (rowcount < a) {
	    while (spacecount > 1) {
		output = output + " ";
		spacecount = spacecount - 1;
	    }
	    while (starcount > 0) {
		output = output + "*";
		starcount = starcount - 1;
	    }
	    output = output + "\n";
	    rowcount = rowcount + 1;
	    starcount = rowcount;
	    spacecount = a - starcount;
	}
	return output;
    }

    public String tri3(int a) {
	int rowcount;
	int starcount;
	int spacecount;
	String output="";
	for(rowcount=a;rowcount>0;rowcount--){

	    // For row n, there are a - n spaces. n starts at 1, increases by 1
	    for(spacecount=rowcount-1;spacecount>0;spacecount--){
		output = output + " ";
	    }

	    // For row n, there are 1 + 2(n-1) stars
	    for(starcount=1;starcount<=1+2*(a-rowcount);starcount++){
		output = output + "*";
	    }
	    output = output + "\n";
	}
	return output;

    }

    public String diamond(int a){
	int rowcount;
	int spacecount;
	int starcount;
	String output = "";
	for (rowcount=0;rowcount<=a;rowcount++){
	    if (rowcount < a/2){
        	for (spacecount=(a/2)-rowcount;spacecount>0;spacecount--){
		    output = output + " ";
		}
		for (starcount=1;starcount<=1+2*(rowcount);starcount++){
		    output = output + "*";
		}
	    }
	    else{
		for (spacecount=0;spacecount<Math.abs(a/2-rowcount);spacecount++){
		    output = output + " ";
		}
		for (starcount=1+2*(a-rowcount-a%2);starcount>0;starcount--){
		    output = output + "*";
		}
	    }
	    output = output + "\n";
	}
	return output;
    }

    public String tri4(int a){
	int rowcount;
	int spacecount;
	int starcount;
	String output ="";
	for (rowcount=0;rowcount<a;rowcount++){
	    for (spacecount=rowcount;spacecount>0;spacecount--){
		output = output + " ";
	    }
	    for (starcount=a-rowcount;starcount>0;starcount--){
		output = output + "*";
	    }     
	    output = output + "\n";
	}
	return output;
    }

}
