import java.util*;
import java.io*;

public class randscan {
    public static void main(String[] args) {
	Random r = new Random();
	for (int i=0;i<10;i++){
	    //double d = Math.random();
	    //System.out.println(d);
	    //int j = (int)(Math.random()*50);
	    //System.out.println(j);
	    //double d = r.nextDouble();
	    //System.out.println(d);
	    //int d = r.nextInt();
	    //System.out.println(d);
	    int d = r.nextInt(100);
	    System.out.println(d);
	}
	Scanner sc = new Scanner(System.in);
	while (!s.equals("done")) {
	    System.out.print("Enter a line: ");
	    s = sc.nextline();
	    System.out.println("You entered: " + s);
	}
    }
}
