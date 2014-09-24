public class Driver{
    public static void main(String[] args){
	String a = "Hello", 
	    b = "world";
	StringStuff thing = new StringStuff();
	System.out.println(thing.nonStart(a,b));
	System.out.println(thing.makeAbba(a,b));
	System.out.println(thing.diff21(5));
	System.out.println(thing.diff21(26));
    }
}
