public class While(){

    //frontTimes Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
    //This took about 3 minutes
    public String frontTimes(String str, int n) {
	String front;
	if (str.length() <= 3) {
	    front = str;
	}
	else {
	    front = str.substring(0,3);
	}
	String output = "";
	while (n > 0) {
	    output = output + front;
	    n = n - 1;
	}
	return output;
    }

    //stringBits Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
    //This took about 5 minutes
    public String stringBits(String str) {
	String output = "";
	int i = 0;
	while (i < str.length()) {
	    output = output + str.substring(i,i+1);
	    i = i + 2;
	}
	return output;
    }

    //stringYak Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap. 
    //This took about 20 minutes

    public String stringYak(String str) {
	int i = 0;
	String output = "";
	while (i < str.length()) {
	    if (str.substring(i,i+1).equals("y") && str.substring(i+2,i+3).equals("k")) {
		i = i + 3;
	    }
	    else {
		output = output + str.substring(i,i+1);
		i = i + 1;
	    }
	}
	return output;
    }
    //Does not work for "yak123ya." Returns "Exception:java.lang.StringIndexOutOfBoundsException: String index out of range: 9 (line number:5)"


    //stringMatch Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings. 
    //This took about 10 minutes.

    public int stringMatch(String a, String b) {
	int i = 0;
	int count = 0;
	while (i+1 < a.length() && i+1 < b.length()){
	    if (a.substring(i,i+2).equals(b.substring(i,i+2))) {
		count = count + 1;
	    }
	    i = i + 1;
	}
	return count;
    }

}
