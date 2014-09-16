import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	//All variables must be declared before use. 
	Greeter g1;
	//This (local) variable g is a Greeter
	/*
	  new does the following
	  1. Allocate enough memory to store a Greeter
	  2. Perform the necessary operations to setup/initialize the
	     memory to be a Greeter
	  3. Return the address of the memory that was allocated.

	  This address is stored in g with the =
	*/
	g1 = new Greeter();
	//Above can be in one line Greeter g = new Greeter();
	// System.out.println(g) prints the location of the memory
	
	Greeter g2,g3;
	g2 = new Greeter();

	g3 = g2;

	System.out.println("g1 is at"+g1);
        System.out.println("g2 is at"+g2);
	System.out.println("g3 is at"+g3); //g3 copies the same address as g2
	//There are new memory allocations every time the program is run

	g2 = new Greeter();

	System.out.println("Test two");
	System.out.println("g1 is at"+g1);
        System.out.println("g2 is at"+g2);
	System.out.println("g3 is at"+g3);

	g1 = new Greeter();

	System.out.println("Test three");
	System.out.println("g1 is at"+g1);
        System.out.println("g2 is at"+g2);
	System.out.println("g3 is at"+g3);

	g1.greet();
	g1.greet();
	g1.ungreet();
    }
}
