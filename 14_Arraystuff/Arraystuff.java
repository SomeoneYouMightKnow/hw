import java.util.*;

public class Arraystuff {
    private int[] a = new int[100];
    Random rnd;
    private final double pi = 3.1415926; //Final variable set once never changed
    
    public String toString(){
	String s = "";
	for (int i = 0; i < a.length; i++){
	    s = s + a[i]+ ", ";
	}
	return s;
    }

    public Arraystuff(){
        this(100);
    }

    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i = 0; i < a.length; i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }

    public int find(n){
	for ( int i = -1; i < a.length; i++){
	    if (a[i] == n) {
	    }
	}
    }

    public int maxVal(int[] a){
	

    }
    
    public static void main(String[] args) {
	/*Array is a pseudo class
	        contiguous block of memory used to store multiple values of a single data type
	*/
	int[] intArray;
	intArray = new int[5];
	String[] StringArray;
	intArray[2] = 20;
	//intArray[7] = 30; //compiles but doesn't run
	//intArray[-1] = 30; //same
	intArray.length; //final variable, can't reassign the value
	//"new" creates 0s or "null"s in the array
	int[] b = {1,2,3,4,5,6,7};


	//int[] a = new[100];
	//System.out.println(a.length);
	Arraystuff as = new Arraystuff();
	System.out.println(as);
    }
}
