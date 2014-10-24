import java.util.*;
public class encounter{
    public void playgame(Basechar player, opponent op){
	try {
	    Thread.sleep(2000);
	} catch (Exception e){}
	System.out.println("Your opponent today will be "+ op.getOname());
	try {
	    Thread.sleep(2000);
	} catch (Exception e){}
	System.out.println("Your attacks are:");
	try {
	    Thread.sleep(1000);
	} catch (Exception e){}
	System.out.println("1. "+player.getMove(1)+": your basic attack.");
	try {
	    Thread.sleep(1000);
	} catch (Exception e){}
	System.out.println("2. "+player.getMove(2)+": a shield that blocks basic attacks.");
	try {
	    Thread.sleep(1000);
	} catch (Exception e){}
	System.out.println("3. "+player.getMove(3)+": increases mana level by two.");
	try {
	    Thread.sleep(1000);
	} catch (Exception e){}
	System.out.println("4. "+player.getMove(4)+": massive attack, breaks shields.");
	try {
	    Thread.sleep(2000);
	} catch (Exception e){}
	System.out.println(op.getOname() + " has similar moves.");
	try {
	    Thread.sleep(2000);
	} catch (Exception e){}
	System.out.println("LET'S RUMBLE!\n");
       	try {
	    Thread.sleep(2000);
	} catch (Exception e){}
	while(player.getHealth() > 0 && op.getOhealth() > 0){
	    System.out.println("\nYour health: "+player.getHealth());
	    System.out.println("Your mana: "+player.getMana());
	    System.out.println(op.getOname()+"'s health: "+op.getOhealth());
	    System.out.println(op.getOname()+"'s mana: "+op.getOmana()+"\n");
	    try {
		Thread.sleep(1000);
	    } catch (Exception e){}
	    System.out.println("Type the number of the " + player.getElement() + "bending move you want to do");
	    System.out.println("Type 5 for help");
	    int move = 0;
	    boolean bad = true;
	    Scanner movetype = new Scanner(System.in);
	    while(bad){
		move = movetype.nextInt();
		bad = false;
		if(move==5){
		     System.out.println("1. "+player.getMove(1)+": 32-38 damage, opponent loses 3 mana (uses 2 mana)");
		     System.out.println("2. "+player.getMove(2)+": blocks basic attacks");
		     System.out.println("3. "+player.getMove(3)+": restores 2 mana");
		     System.out.println("4. "+player.getMove(4)+": 100 damage, 5 mana loss to opponent unshielded. If shielded: does 47-53 damage, opponent loses 2 mana (uses 5 mana)");
		     bad = true;
		}
		if((move==1&&player.getMana()<2)||(move==4&&player.getMana()<5)){
		    System.out.println("Insufficient mana for this move");
		    bad = true;
		}
		if(move!=3&&player.getMana()<0){
		    System.out.println("WARNING: Your mana level is negative. You MUST restore mana!");
		    bad = true;
		}
	    }
	    int omove = op.opick(player.getMana(), op.getOmana());
	    int a=move;
	    int b=omove;
	    System.out.println("You used " + player.getMove(a));
	    try {
		Thread.sleep(1000);
	    } catch (Exception e){}
	    System.out.println(op.getOname() + " used " + op.getOmove(b));
	    try {
		Thread.sleep(1000);
	    } catch (Exception e){}
	    if((a==3)||(b==3)||(a!=2&&b!=2)){
		if(a==1){
		    player.setMana(-2);
		    op.setOmana(-3);
		    int x = 32 + (int)(Math.random()*7);
		    op.setOhealth(-1*x);
		    System.out.println("You used 2 mana.");
		    try {
			Thread.sleep(1000);
		    } catch (Exception e){}
		    System.out.println(op.getOname() + " lost " + x + " health and 3 mana.");
		    try {
			Thread.sleep(1000);
		    } catch (Exception e){}
		}
		if(a==3){
		    player.setMana(2);
		    System.out.println("You gained two mana.");
		    try {
			Thread.sleep(1000);
		    } catch (Exception e){}
		}
		if(a==4){
		    player.setMana(-5);
		    op.setOmana(-5);
		    int x = 100;
		    op.setOhealth(-1*x);
		    System.out.println("You used 5 mana.");
		    try {
			Thread.sleep(1000);
		    } catch (Exception e){}
		    System.out.println(op.getOname() + " lost 100 health and 5 mana.");
		    try {
			Thread.sleep(1000);
		    } catch (Exception e){}
		}
		if(b==1){
		    player.setMana(-3);
		    op.setOmana(-2);
		    int x = 32 + (int)(Math.random()*7);
		    player.setHealth(-1*x);
		    System.out.println(op.getOname()+" used 2 mana.");
		    try {
			Thread.sleep(1000);
		    } catch (Exception e){}
		    System.out.println("You lost " + x + " health and 3 mana.");
		    try {
			Thread.sleep(1000);
		    } catch (Exception e){}
		}
		if(b==3){
		    op.setOmana(2);
		    System.out.println(op.getOname() + " gained two mana.");
		    try {
			Thread.sleep(1000);
		    } catch (Exception e){}
		}
		if(b==4){
		    player.setMana(-5);
		    op.setOmana(-5);
		    int x = 100;
		    player.setHealth(-1*x);
		    System.out.println(op.getOname() + " used 5 mana.");
		    try {
			Thread.sleep(1000);
		    } catch (Exception e){}
		    System.out.println("You lost 100 health and 5 mana.");
		    try {
			Thread.sleep(1000);
		    } catch (Exception e){}
		}
	    }
	    if(a==2&&b==1){
		op.setOmana(-2);
		System.out.println(op.getOname() + " used 2 mana but " + op.getOname() + "'s " + op.getOmove(1) + " was blocked.");
		try {
		    Thread.sleep(1000);
		} catch (Exception e){}
	    }
	    if(a==1&&b==2){
		player.setMana(-2);
		System.out.println("You used 2 mana but your " + player.getMove(1) + " was blocked.");
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
		player.setMana(-2);
		op.setOmana(-5);
		int x = 47 + (int)(Math.random()*7);
		player.setHealth(-1*x);
		System.out.println(op.getOname() + " used 5 mana but " + op.getOname() + "'s " + op.getOmove(4) + " was partially blocked.");
		try {
		    Thread.sleep(1000);
		} catch (Exception e){}
		System.out.println("You still lost " + x + " health and 2 mana.");
		try {
		    Thread.sleep(1000);
		} catch (Exception e){}
	    }
	    if(a==4&&b==2){
		player.setMana(-5);
		op.setOmana(-2);
		int x = 47 + (int)(Math.random()*7);
		op.setOhealth(-1*x);
		System.out.println("You used 5 mana but your" + player.getMove(4) + " was partially blocked.");
		try {
		    Thread.sleep(1000);
		} catch (Exception e){}
		System.out.println(op.getOname() + "still lost " + x + " health and 2 mana.");
		try {
		    Thread.sleep(1000);
		} catch (Exception e){}
	    }
	}
	System.out.println("\n\n\n");
	if(player.getHealth()>0) System.out.println("Congratulations! You vanquished your foe with " + player.getHealth() + " health to spare!");
	if(op.getOhealth()>0) System.out.println("Sadly, you were defeated in battle. Your opponent had " + op.getOhealth() + " health to spare!");
	if(player.getHealth()<=0&&op.getOhealth()<=0) System.out.println("This element-bending battle was equally fought. Both fighters die simultaneously!");
    }
}
