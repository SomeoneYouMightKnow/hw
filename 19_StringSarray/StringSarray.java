
public class StringSarray {
    String[] data;
    int last; //index of last element

    public StringSarray() {
        // set up the initial instance variables
	data = new String[10];
	last = -1;
    }

    public String toString(){
	String array = "";
	for (int i = 0; i < data.length; i++){
	    array+= data[i] + ", ";
	}
	return array;
    }

    public boolean add(String s){
        // adds an item to the end of the list, grow if needed
        // returns true
	if (data.length > size()){
	    data[size()] = s;
	}
	else{
	    String[] newData  = new String[data.length+100];
	    for (int i = 0; i < data.length; i++){
		newData[i] = data[i];
	    }
	    newData[size()] = s;
	    data = newData;
	}
	last++;
	return true;
    }

    public void  add(int index, String s){
        // adds item s  at index, shifting everything down as needed.
        // also grows as needed
	if (index > size()) {
	    System.out.println("Index out of bounds");
	    return;
	}
	if (data.length > size()){
	    for (int i = size(); i > index; i--){
		data[i] = data[i-1];
	    }
	    data[index] = s;
	}
	else{
	    String[] newData = new String[data.length+100];
	    for (int i = 0; i < index ; i++){
		newData[i] = data[i];
	    }
	    newData[index] = s;
	    for (int i = index + 1; i < size(); i++) {
		newData[i] = data[i-1];
	    }
	    data = newData;
	}
	last++;
    }

    public int size() {
        // returns the number of items in the list (not the array size)
	return last + 1;
    }

    public String get(int index) {
        // returns the item at location index of the list
	return data[index];
    }

    public String set(int index, String s){
        // sets the item at location index to value s
        // returns the old value.
	String old = data[index];
	data[index] = s;
	return old;
    }

    public String remove(int index){
        // removes the item at index
        // returns the old value
	String old = data[index];
	for (int i = index; i < size(); i++){
	    data[i] = data[i+1];
	}
	last--;
	return old;
    }


    public static void main(String[] args){
	StringSarray array = new StringSarray();
	System.out.println(array);
	System.out.println(array.size());
	array.add("Hi");
	System.out.println(array);
	System.out.println(array.size());
	array.add(5,"Hello");
	array.add("Hey");
	array.add("Sup");
	array.add("Hola");
	array.add("Ni hao");
	array.add("Bonjour");
	array.add(5,"Hello");
	System.out.println(array);
	System.out.println(array.size());
	array.set(5,"Yo");
	System.out.println(array);
	System.out.println(array.size());
	array.remove(5);
	System.out.println(array);
	System.out.println(array.size());
    }

}