import java.util.*;

public class Arraystuff {
    private int[] a;

    Random rnd;
    private final double pi = 3.1415926; //Final variable set once never changed

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

    public Arraystuff(int min, int max, int size){
	rnd = new Random();
	a = new int[size];
	for (int i = 0; i < a.length; i++){
	    a[i] = min + rnd.nextInt(max-min);
	}
    }

    public String toString(){
	String s = "";
	for (int i = 0; i < a.length; i++){
	    s = s + a[i]+ ", ";
	}
	return s;
    }

    public int find(int n){
	for ( int i = 0; i < a.length; i++){
	    if (a[i] == n) {
		/*
		  if (a[i] !== n) {
		  if (a[i] == a.length-1){
		  return -1;
		  }
		  }
		  else{
		  return i;
		  }
		*/
		if (a[i] == n){
		    return i;
		}
	    }
	}
	return -1;
    }

    public int maxVal(int[] a){
	int max = a[0]; //don't use max = 0 in case of negatives.
	for ( int i = 0; i < a.length; i++){
	    if (a[i] > max){
		max = a[i];
	    }
	}
	return max;
    }

    public int maxValIndex(int[] a){
	int max = a[0];
	int maxIndex = 0;
	for ( int i = 0; i < a.length; i++){
	    if (a[i] > max){
		max = a[i];
		maxIndex = i;
	    }
	}
	return maxIndex;
    }

    
    public int freq(int i){
	int element = a[i];
	int output = 0;
	if (i < a.length && i <= 0) {
	    for (int c = 0; c < a.length; c++){
		if (a[c] == element){
		    output++;
		}
	    }
	}
	return output;
    }

    /*
    public int mode(int[] a){
	int[] freqs= new int[a.length];
	for(int i = 0; i<a.length; i++){
	    freqs[i] = freq(i);
	}
	return maxVal(freqs);
    }
    */
    public int mode(int[] a){
	int modeSoFar=a[0],
	    modeCount=freq(a[0]);
				
	for (int i=0;i<a.length;i++){
	    if (freq(a[i])>modeCount){
		modeSoFar = a[i];
		modeCount = freq(a[i]);
	    }
	}
	return modeSoFar;
    }

    public int fastmode(int[] a){
	int[] freqs = new int[maxVal(a)+1];
	for (int i = 0; i < a.length; i++){
	    freqs[a[i]]++;
	}
	return a[maxValIndex(freqs)];
    }

    public int sum67(int[] nums) {
	int sum = 0;
	for (int i = 0; i < nums.length; i++){
	    if (nums[i] != 6){
		sum+= nums[i];
	    }
	    else {
		for (int c = i; c < nums.length; c++){
		    if (nums[c] == 7){
			i = c;
			break;
		    }
		}
	    }
	}
	return sum;
    }

    public boolean more14(int[] nums) {
	int ones = 0;
	int fours = 0;
	for (int i = 0; i < nums.length; i++){
	    if (nums[i] == 1){
		ones++;
	    }
	    else if (nums[i] == 4){
		fours++;
	    }
	}
	return ones > fours;
    }

    public int[] tenRun(int[] nums) {
	for (int i = 0; i < nums.length; i++){
	    if (nums[i] % 10 == 0) {
		for( int c = i+1; c < nums.length; c++){
		    if (nums[c] % 10 !=0) {
			nums[c] = nums[i];
		    }
		    else{
			i = c;
		    }
		}
	    }
	}
	return nums;
    }

    public boolean tripleUp(int[] nums) {
	for (int i = 0; i<nums.length-2; i++){
	    if ((nums[i] + 1) == nums[i+1] && nums[i+1] == (nums[i+2] - 1)) {
		return true;
	    }
	}
	return false;
    }

    public boolean canBalance(int[] nums) {
	int front;
	int back;
	for (int i = 0; i < nums.length; i++){
	    front = 0;
	    back = 0;
	    for (int c = 0; c < i; c++) {
		front += nums[c];
	    }
	    for (int c = i; c<nums.length; c++){
		back += nums[c];
	    }
	    if (front == back){
		return true;}
	}
	return false;
    }

    public int[] seriesUp(int n) {
	int[] a = new int[n*(n+1)/2];
	int c = 1;
	int limit = 1;
	for (int i = 0; i < a.length; i++){
	    if (c>limit) {
		limit++;
		c=1;
	    }
	    a[i] = c;
	    c++;
	}
	return a;
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
	//intArray.length = 100; //final variable, can't reassign the value
	//"new" creates 0s or "null"s in the array
	int[] b = {1,2,3,4,5,6,7};


	
	//args is an array of strings.
	System.out.println(args.length); //Stores from command line, Strings separated by spaces, grouped by quotes.
	int arraylength=100;
        int maxvalue=100;

	if (args.length > 0){
	    System.out.println(args[0]);
	    arraylength = Integer.parseInt(args[0]);
	}
       	if (args.length > 1){
	    System.out.println(args[1]);
	    maxvalue = Integer.parseInt(args[1]);
	}
	Arraystuff thing = new Arraystuff(0, maxvalue, arraylength);

    }
}
