import java.util.*;

public class Basechar{
    private String name;
    private int health = 100;
    private int mana = 0;
    private int ohealth = 100;
    private int omana = 0;
    private String element;
    private String opponent;
    private String a1name;
    private String a2name;
    private String a3name;
    private String a4name;
    private String o1name;
    private String o2name;
    private String o3name;
    private String o4name;
    public Basechar(){
	System.out.println("\nAnd what is your name?");
	Scanner n = new Scanner(System.in);
	setName(n.nextLine());
    }
    public void setName(String n){
	name = n;
    }
    public void setElement(String n){
	element = n;
    }
    public void setOpponent(String n){
	opponent = n;
    }
    public void setA1name(String n){
	a1name = n;
    }
    public void setA2name(String n){
	a2name = n;
    }
    public void setA3name(String n){
	a3name = n;
    }
    public void setA4name(String n){
	a4name = n;
    }
    public void setO1name(String n){
	o1name = n;
    }
    public void setO2name(String n){
	o2name = n;
    }
    public void setO3name(String n){
	o3name = n;
    }
    public void setO4name(String n){
	o4name = n;
    }
    public String getName(){
	return name;
    }
    public int getHealth(){
	return health;
    }
    public int getOhealth(){
	return ohealth;
    }
    public String getMove(int a){
	if(a==1) return a1name;
	if(a==2) return a2name;
	if(a==3) return a3name;
	if(a==4) return a4name;
	return "";
    }
    public String getOmove(int a){
	if(a==1) return o1name;
	if(a==2) return o2name;
	if(a==3) return o3name;
	if(a==4) return o4name;
	return "";
    }
    public int opick(int a, int b){
	if(a<1){
	    if(b<6){
		return 3;
	    }else{
		return 3+(int)(Math.random()*2);
	    }
	}
	if(b<1){
	    return 2+(int)(Math.random()*2);
	}
	if(a<3&&b<3){
	    if((int)(Math.random()*3)==1){
		return 1;
	    }else{
		return 2+(int)(Math.random()*2);
	    }
	}
	if(b<3){
	    int x = (int)(Math.random()*6);
	    if(x==0) return 1;
	    if(x==1) return 3;
	    return 2;
	}
	if(a<3){
	    return 3+(int)(Math.random()*2);
	}
	int x = (int)(Math.random()*3);
	if(x==0) return 2;
	return 4;
    }
    public void playgame(){
	try {
	    Thread.sleep(2000);
	} catch (Exception e){}
	System.out.println("Your opponent today will be "+ opponent);
	try {
	    Thread.sleep(2000);
	} catch (Exception e){}
	System.out.println("Your attacks are:");
	try {
	    Thread.sleep(1000);
	} catch (Exception e){}
	System.out.println("1. "+a1name+": your basic attack.");
	try {
	    Thread.sleep(1000);
	} catch (Exception e){}
	System.out.println("2. "+a2name+": a shield that blocks basic attacks.");
	try {
	    Thread.sleep(1000);
	} catch (Exception e){}
	System.out.println("3. "+a3name+": increases mana level by one.");
	try {
	    Thread.sleep(1000);
	} catch (Exception e){}
	System.out.println("4. "+a4name+": massive attack, breaks shields.");
	try {
	    Thread.sleep(2000);
	} catch (Exception e){}
	System.out.println(opponent + " has similar moves.");
	try {
	    Thread.sleep(2000);
	} catch (Exception e){}
	System.out.println("LET'S RUMBLE!\n");
       	try {
	    Thread.sleep(2000);
	} catch (Exception e){}
	while(health > 0 && ohealth > 0){
	    System.out.println("Your health: "+health);
	    System.out.println("Your mana: "+mana);
	    System.out.println(opponent+"'s health: "+ohealth);
	    System.out.println(opponent+"'s mana: "+omana+"\n");
	    try {
		Thread.sleep(1000);
	    } catch (Exception e){}
	    System.out.println("Type the number of the " + element + "bending move you want to do");
	    System.out.println("1. "+a1name+": 32-38 damage, opponent loses 1 mana (uses 1 mana)");
	    System.out.println("2. "+a2name+": blocks basic attacks");
	    System.out.println("3. "+a3name+": restores 1 mana");
	    System.out.println("4. "+a4name+": 100 damage[if shielded: does 47-53 damage] opponent loses 1 mana (uses 3 mana)");
	    int move = 0;
	    boolean bad = true;
	    Scanner movetype = new Scanner(System.in);
	    while(bad){
		move = movetype.nextInt();
		bad = false;
		if((move==1&&mana<1)||(move==4&&mana<3)){
		    System.out.println("Insufficient mana for this move");
		    bad = true;
		}
	    }
	    int omove = opick(mana, omana);
	    result(move, omove);
	}
	System.out.println("\n\n\n");
	if(health>0) System.out.println("Congratulations! You vanquished your foe with " + health + " health to spare!");
	if(ohealth>0) System.out.println("Sadly, you were defeated in battle. Your opponent had " + ohealth + " health to spare!");
	if(health<=0&&ohealth<=0) System.out.println("This element-bending battle was equally fought. Both fighters die simultaneously!");
    }
    public void result(int a, int b){
	System.out.println("You used " + getMove(a));
	try {
	    Thread.sleep(1000);
	} catch (Exception e){}
	System.out.println(opponent + " used " + getOmove(b));
	try {
	    Thread.sleep(1000);
	} catch (Exception e){}
	if((a==3)||(b==3)||(a!=2&&b!=2)){
	    if(a==1){
		mana-=1;
		omana-=1;
		int x = 32 + (int)(Math.random()*7);
		ohealth-=x;
		System.out.println("You used 1 mana.");
		try {
		    Thread.sleep(1000);
		} catch (Exception e){}
		System.out.println(opponent + " lost " + x + " health and 1 mana.");
		try {
		    Thread.sleep(1000);
		} catch (Exception e){}
	    }
	    if(a==3){
		mana+=1;
		System.out.println("You gained one mana.");
		try {
		    Thread.sleep(1000);
		} catch (Exception e){}
	    }
	    if(a==4){
		mana-=3;
		omana-=1;
		int x = 100;
		ohealth-=x;
		System.out.println("You used 3 mana.");
		try {
		    Thread.sleep(1000);
		} catch (Exception e){}
		System.out.println(opponent + " lost 100 health and 1 mana.");
		try {
		    Thread.sleep(1000);
		} catch (Exception e){}
	    }
	    if(b==1){
		mana-=1;
		omana-=1;
		int x = 32 + (int)(Math.random()*7);
		health-=x;
		System.out.println(opponent+" used 1 mana.");
		try {
		    Thread.sleep(1000);
		} catch (Exception e){}
		System.out.println("You lost " + x + " health and 1 mana.");
		try {
		    Thread.sleep(1000);
		} catch (Exception e){}
	    }
	    if(b==3){
		omana+=1;
		System.out.println(opponent + " gained one mana.");
		try {
		    Thread.sleep(1000);
		} catch (Exception e){}
	    }
	    if(b==4){
		mana-=1;
		omana-=3;
		int x = 100;
		health-=x;
		System.out.println(opponent + " used 3 mana.");
		try {
		    Thread.sleep(1000);
		} catch (Exception e){}
		System.out.println("You lost 100 health and 1 mana.");
		try {
		    Thread.sleep(1000);
		} catch (Exception e){}
	    }
	}
	if(a==2&&b==1){
	    omana-=1;
	    System.out.println(opponent + " used 1 mana but " + opponent + "'s " + o1name + " was blocked.");
	    try {
		Thread.sleep(1000);
	    } catch (Exception e){}
	}
	if(a==1&&b==2){
	    mana-=1;
	    System.out.println("You used 1 mana but your " + a1name + " was blocked.");
	    try {
		Thread.sleep(1000);
	    } catch (Exception e){}
	}
	if(a==2&&b==2){
	    System.out.println("Both benders blocked");
	    try {
		Thread.sleep(1000);
	    } catch (Exception e){}
	}
	if(a==2&&b==4){
	    mana-=1;
	    omana-=3;
	    int x = 47 + (int)(Math.random()*7);
	    health-=x;
	    System.out.println(opponent + " used 3 mana but " + opponent + "'s " + o1name + " was partially blocked.");
	    try {
		Thread.sleep(1000);
	    } catch (Exception e){}
	    System.out.println("You still lost " + x + " health and 1 mana.");
	    try {
		Thread.sleep(1000);
	    } catch (Exception e){}
	}
	if(a==4&&b==2){
	    mana-=3;
	    omana-=1;
	    int x = 47 + (int)(Math.random()*7);
	    ohealth-=x;
	    System.out.println(opponent + " used 3 mana but " + opponent + "'s " + o1name + " was partially blocked.");
	    try {
		Thread.sleep(1000);
	    } catch (Exception e){}
	    System.out.println(opponent + "still lost " + x + " health and 1 mana.");
	    try {
		Thread.sleep(1000);
	    } catch (Exception e){}
	}
    }
}
