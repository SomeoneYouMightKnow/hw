public class Frame{
    public String frame(int r, int c){
	int height;
	int width;
	String s = "";
	for(height=0;height<r;height++) {
	    if (height==0 || height==r-1){
		for(width=0;width<c;width++) {
		    s = s + "*";
	    	}
	    }
	    else{
	    	s = s + "*";
	    	for(width=1;width<c-1;width++) {
	    	    s = s + " ";
	    	}
		s = s + "*";
	    }
	    s = s + "\n";
	}
	return s;
    }

    //stringSplosion Given a non-empty string like "Code" return a string like "CCoCodCode". 
    public String stringSplosion(String str) {
	String output = "";
	int i;
	for (i=0;i<str.length();i++){
	    output = output + str.substring(0,i+1);
	}
	return output;
    }

    //stringX Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed. 
    public String stringX(String str) {
	int i;
	String output = "";
	for (i=0;i<str.length();i++){
	    if (i>0 && i < str.length()-1 && str.substring(i,i+1).equals("x")){
	    }
	    else{
		output = output + str.substring(i,i+1);
	    }
	}
	return output;
    }


}
