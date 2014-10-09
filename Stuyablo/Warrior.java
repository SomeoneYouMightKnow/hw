//Subclass of Basechar. has access to public items in Basechar.
//Warrior.getHealth() overrides Basechar.getHealth()
//super.____ accesses (public) overriden stuff
public class Warrior extends Basechar{
    public int health = 5000;
    private int healthboost = 5;
    public int getHealth(){ 
	return healthboost + super.getHealth();
    }

    public void attack(Basechar other){
	System.out.println(this.getName()+" is SUPERattacking "+other.getName());
    }

}
