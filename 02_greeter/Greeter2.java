public class Greeter2 {

    //Instance variables
    private String greeting = new String("Hello, world!");
    //instance variable: in-class variable, outside methods
    //never public.

    //Constructors
    /* called when you "new" an instance of a class.
       Java's default constructor is used when there are no constructors.
            Returns nothing
       always public.
       no return type (not even void).
       
       Overloading: creating two constructors with the same name but a different number of parameters. Parameters decide which one is used
    */
    
    public Greeter(String s){
	System.out.println("In the constructor with string");
	greeting = s
    }

    public Greeter(){
	System.out.println("In the constructor with 0 params");
	greeting = "Hello World!" //Done instead of new String("Hello world!")
    }

    //Accessor methods are public.
    public void setGreeting(String s){
	greeting = s;
    }

    //The word after public defines the return type. void means no return.
    public String getGreeting(){
	return greeting;
    }

    public void greet() {
       	//String greeting = new String("Sup!");  //local variable
      	System.out.println(greeting);
    }

    public void ungreet() {
	System.out.println("I'm out!");
    }
}
