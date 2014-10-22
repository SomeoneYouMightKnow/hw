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
	    Air p1 = new Air();
	    opponent op1 = new opponent(3);
	    System.out.println("\nWelcome to the arena "+p1.getName()+" the "+bender+"bender!");
	    encounter boss = new encounter();
	    boss.playgame(p1, op1);
	}
	if(bender.equals("water")){
	    Water p1 = new Water();
	    opponent op1 = new opponent(4);
	    System.out.println("\nWelcome to the arena "+p1.getName()+" the "+bender+"bender!");
	    encounter boss = new encounter();
	    boss.playgame(p1, op1);
	}
	if(bender.equals("earth")){
	    Earth p1 = new Earth();
	    opponent op1 = new opponent(1);
	    System.out.println("\nWelcome to the arena "+p1.getName()+" the "+bender+"bender!");
	    encounter boss = new encounter();
	    boss.playgame(p1, op1);
	}
	if(bender.equals("fire")){
	    Fire p1 = new Fire();
	    opponent op1 = new opponent(2);
	    System.out.println("\nWelcome to the arena "+p1.getName()+" the "+bender+"bender!");
	    encounter boss = new encounter();
	    boss.playgame(p1, op1);
	}
    }
}
