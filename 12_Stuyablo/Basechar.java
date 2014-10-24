import java.util.*;
public class Basechar{
    private String name;
    private int health = 100;
    private int mana = 0;
    private String element;
    private String a1name;
    private String a2name;
    private String a3name;
    private String a4name;
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
    public String getName(){
	return name;
    }
    public String getElement(){
	return element;
    }
    public int getHealth(){
	return health;
    }
    public int getMana(){
	return mana;
    }
    public String getMove(int a){
	if(a==1) return a1name;
	if(a==2) return a2name;
	if(a==3) return a3name;
	if(a==4) return a4name;
	return "";
    }
    public void setHealth(int a){
	health += a;
    }
    public void setMana(int a){
	mana += a;
    }
}
