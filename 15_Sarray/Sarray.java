import.java.util.*;

public class Sarray {
    int[] data;
    int   last;
    Random rnd;

    public Sarray() {
        // set up the initial instance variables
	data = new int[10];
	last = 5;
    }

    public String toString(){
	String array = "";
	for (int i = 0; i < data.length; i++){
	    array+= data[i] + ", ";
	}
	return array;
    }

    public boolean add(int i){
        // adds an item to the end of the list, grow if needed
        // returns true
	if (data.length > size()){
	    data[size()] = i;
	}
	else{
	    int[] newData  = new int[data.length+1000];
	    for (int c = 0; c < data.length; c++){
		newData[c] = data[c];
	    }
	    newData[newData.length-1] = i;
	    data = newData;
	}
	return true;
    }

    public void  add(int index, int i){
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed
	if (data.length > size()){
	    for (int c = data.length; c > index; c--){
		data[c] = data[c-1];
	    }
	    data[index] = i;
	}
	else{
	    int[] newData = new int[data.length+1];
	    int[] newData = new int[data.length+1000];
	    for (int c = 0; c < index ; c++){
		newData[c] = data[c];
	    }
	    newData[index] = i;
	    for (int c = index + 1; c < data.length; c++) {
		newData[c+1] = data[c];
	    }
	    data = newData;
	}
    }

    public int size() {
        // returns the number of items in the list (not the array size)
	int index = 0;
	searchFromEnd:
	for (int i = data.length; i>0 ; i--){
	    if (data[i] != 0) {
		index = i+1;
		break searchFromEnd;
	    }
	}
	return index;
    }

    public int get(int index) {
        // returns the item at location index of the list
	return data[index];
    }

    public int set(int index, int i){
        // sets the item at location index to value i
        // returns the old value.
	int old = data[index];
	data[index] = i;
	return old;
    }

    public int remove(int index){
        // removes the item at index
        // returns the old value
	int old = data[index];
	for (int i = index; i < size(); i++){
	    data[i] = data[i+1];
	}
	return old;
    }


    public static void main(String[] args){
	Sarray array = new Sarray();
	System.out.println(array);
	System.out.println(array.size());
	array.add(5);
	System.out.println();
	System.out.println(array);
	System.out.println(array.size());
	System.out.println();
	array.add(5,5);
	System.out.println(array);
	System.out.println();
	System.out.println(array.get(5));
	array.set(5,0);
	System.out.println(array);
	System.out.println(array.size());
	System.out.println();
	array.remove(5);
	System.out.println(array);
	System.out.println(array.size());
    }

}
