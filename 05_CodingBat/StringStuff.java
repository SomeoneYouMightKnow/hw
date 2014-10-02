public class StringStuff{
    //nonStart Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1. 

    public String nonStart(String a, String b) {
	return a.substring(1) + b.substring(1);
    }

    //makeAbba Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". 

    public String makeAbba(String a, String b) {
	return a + b + b + a;
    }

    //diff21 Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21. 

    public int diff21(int n) {
	if (n <= 21) {
	    return 21 - n;
	} else {
	    return 2*(n-21);}
    }



    //Class lab

    //nearHundred Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number. 

    public boolean nearHundred(int n) {
	if (Math.abs(100 - n) <=10 || Math.abs(200 - n) <= 10) {
	    return true;
	} else {
	    return false;
	}
    }

    //mixStart Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count. 

    public boolean mixStart(String str) {
	if (str.length() >= 3) {
	    return str.substring(1,3).equals("ix");
	} else {
	    return false;
	}
    }

    //teaParty We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0). 

    public int teaParty(int tea, int candy) {
	if (tea < 5 || candy < 5) {
	    return 0;
	} else{
	    if (tea >= 2 * candy || candy >= 2 * tea) {
		return 2;
	    } else{
		return 1;
	    }
	}
    }

    //lastDigit Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7. 

    public boolean lastDigit(int a, int b, int c) {
	if ( a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10) {
	    return true;
	} else {
	    return false;
	}
    }
}
