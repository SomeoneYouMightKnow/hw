//Subclass of Basechar. has access to public items in Basechar.
//Warrior.getHealth() overrides Basechar.getHealth()
//super.____ accesses (public) overriden stuff
public class Warrior extends Basechar{
    public int health = 5000;
    private int healthboost = 5;

    public Warrior(){
	setName("DEFAULT");
    }

    public Warrior(String n){
	//calls superclass constructor.
	//super();
	super(n); //calls superclass 1 param constructor. Now you don't need the 0 param superclass constructor.
	//setName(n);
    }

    public int getHealth(){ 
	return healthboost + super.getHealth();
    }

    public void attack(Basechar other){
	//System.out.println(this.getName()+" is SUPERattacking "+other.getName());
	//automatically calls toString
	System.out.println(this+" is SUPERattacking "+other);
    }
}
