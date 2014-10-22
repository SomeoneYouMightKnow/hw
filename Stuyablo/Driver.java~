import java.util.*;
public class Driver{
    public static void main(String[] args){
	System.out.println("\n\nWelcome, to the element-bending arena!\n");
	try {
	    Thread.sleep(1000);
	} catch (Exception e){}
	System.out.println("Enlarge your terminal window.\n");
	try {
	    Thread.sleep(1000);
	} catch (Exception e){}
	System.out.println("What type of bender are you?\nAir\nWater\nEarth\nFire");
	String bender="";
	Scanner bendtype = new Scanner(System.in);
	bender = bendtype.nextLine().toLowerCase();
	while(!(bender.equals("air")||bender.equals("water")||bender.equals("earth")||bender.equals("fire"))){
	    System.out.println("Please type the name of an element only");
	    bender = bendtype.nextLine().toLowerCase();
	}
	if(bender.equals("air")){
	    Air player = new Air();
	    System.out.println("\nWelcome to the arena "+player.getName()+" the "+bender+"bender!");
	    player.playgame();
	}
	if(bender.equals("water")){
	    Water player = new Water();
	    System.out.println("\nWelcome to the arena "+player.getName()+" the "+bender+"bender!");
	    player.playgame();
	}
	if(bender.equals("earth")){
	    Earth player = new Earth();
	    System.out.println("\nWelcome to the arena "+player.getName()+" the "+bender+"bender!");
	    player.playgame();
	}
	if(bender.equals("fire")){
	    Fire player = new Fire();
	    System.out.println("\nWelcome to the arena "+player.getName()+" the "+bender+"bender!");
	    player.playgame();
	}
    }
}
