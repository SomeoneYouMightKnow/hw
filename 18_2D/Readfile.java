import java.io.*; //Don't import the .*

public class Readfile {

    public static void main(String[] args) {
	Scanner sc = null;
	
	try{
	    sc = new Scanner(new File("words.txt"));
	} catch (Exception e) {
	    System.out.println("File not found");
	    System.exit(0);
	}

	//Don't put the whole program in the try..catch
	//Make sure sc exists and is initialized outside of the try..catch
	while (sc.hasNext()) {
	    String s = sc.next();
	    System.out.println("Next line: "+s);
	}

    }
    
}
