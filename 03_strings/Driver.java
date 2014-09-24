public class Driver {
    public static void main(String[] args){
        String s="thomas wong";
        int i = s.indexOf(" ");
	String first = s.substring(0,i);
       	String last = s.substring(i+1);
	System.out.println("first name: " + first);
	System.out.println("last name: " + last);
    }
}
