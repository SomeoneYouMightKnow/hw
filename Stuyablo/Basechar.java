//superclass for Warrior and Mage
public class Basechar{
    private int health = 20;
    private String name;

    public Basechar(){
	setName("default");
    }

    public Basechar(String n){
	setName(n);
    }

    public void attack(Basechar other){
	System.out.println(this.getName()+" is attacking "+other.getName());
    }

    public void setName(String name){
	this.name = name; //this.___ refers to instance var/methods of this class
    }

    public String getName(){
	return name;
    }

    public int getHealth(){
	return health;
    }
}
