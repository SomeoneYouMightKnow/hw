import java.io.*;
import java.util.*;

//This program prints Hello world!

public class Greeter {

    /*
      Attributes go here
      "Instance variables"
      Similar to turtle variables
    */
	public void greet() {
	    
	    String s; //built-in class. Immutable.
	    s = new String("Hello string!");
	    System.out.println(s);

	    System.out.println("Hello world!");
	}
    //If I used private instead of public, it would be unusable in Driver.java
    //Unless ungreet was in another (public) in-class method such as greet()
	public void ungreet() {
	    System.out.println("I'm out");
	}
}
