//superclass for Warrior and Mage
//abstract class means you can't create a Basechar without making a subclass
//i.e. Basechar b = new Basechar() won't work
//inheritance still works
public abstract class Basechar{
    private int health = 20;
    private String name;

    public Basechar(){
	setName("default");
    }

    public Basechar(String n){
	setName(n);
    }

    /*   public void attack(Basechar other){
	System.out.println(this.getName()+" is attacking "+other.getName());
    }
    */
    //Mage and Warrior have their own attacks.
    //abstract methods must be implemented in the subclass
    public void attack(Basechar other);
    //method body will be coded in subclass

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
