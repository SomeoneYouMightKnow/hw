public class StringStuff{
    public void test1(){
	String s1 = "hello",
	    s2 = "hello", //refers to the same "hello" as s1
	    s3 = new String("hello"), //uses new memory
	    s4 = new String("hello"); //uses even more memory
	System.out.println("s1 == s2: "+(s1 == s2));
	//(s1==s2) parens are important
	System.out.println("s1 == s3: "+(s1 == s3)); 
	System.out.println("s1 == s4: "+(s1 == s4));
	System.out.println("s2 == s3: "+(s2 == s3));
	System.out.println("s2 == s4: "+(s2 == s4));
	System.out.println("s3 == s4: "+(s3 == s4));
	//indexOf, substring, split, length
	//equals compares character sequences
	//compareTo compares lexicographic values. <0 if less than, 0 if equal, >0 if greater than. Capitals > lowercase. Compares ASCII values.
	//compareToIgnoreCase, etc.
	//endsWith
    }
}
