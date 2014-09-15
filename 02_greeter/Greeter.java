import java.io.*;
import java.util.*;

//This program prints Hello world!

public class Greeter {
	public void greet() {
		System.out.println("Hello world!");
        }
    //If I used private instead of public, it would be unusable in Driver.java
    //Unless ungreet was in another (public) in-class method such as greet()
	public void ungreet() {
	    System.out.println("I'm out");
	}
}
