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

    public int maxVal(){
	int max = a[0]; //don't use max = 0 in case of negatives.
	for ( int i = 0; i < a.length; i++){
	    if (a[i] > m){
		max = a[i];
	    }
	}
	return max;
    }

    public int freq(int i){
	if (i > a.length) {
	    return "Index not in array";
	}
	element = a[i];
	output = 0;
	for (int c = 0; c < a.length; c++){
	    if (a[c] == element){
		output++;
	    }
	}
	return output;
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
	for (int i = 0; i+2< nums.length; i++){
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
	intArray.length; //final variable, can't reassign the value
	//"new" creates 0s or "null"s in the array
	int[] b = {1,2,3,4,5,6,7};


	//int[] a = new int[100];
	//System.out.println(a.length);
	Arraystuff as = new Arraystuff();
	System.out.println(as);
    }
}
