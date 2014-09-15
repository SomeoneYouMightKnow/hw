import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	//All variables must be declared before use. 
	Greeter g;
	//This (local) variable g is a Greeter
	/*
	  new does the following
	  1. Allocate enough memory to store a Greeter
	  2. Perform the necessary operations to setup/initialize the
	     memory to be a Greeter
	  3. Return the address of the memory that was allocated.

	  This address is stored in g with the =
	*/
	g = new Greeter();
	//Above can be in one line Greeter g = new Greeter();
	// System.out.println(g) prints the location of the memory
	g.greet();
	g.greet();
	g.ungreet();
    }
}
