public class Driver{
    public static void main(String[] args){
	Basechar c = new Basechar();
	Warrior w = new Warrior();
	Mage m = new Mage();
	Basechar c2;
	Warrior w2;
	Mage m2;

	//nope w2=m;
	//nope w2=c;
	c2 = w; //variable of a superclass can refer to an instance of a subclass. Converse is false.
	System.out.println(c2.getHealth()); //returns Warrior.getHealth()

	c2 = m; 
	System.out.println(c2.getHealth()); //returns health of mage
	//System.out.print(c2.getManna()); //does not work
	System.out.println( ((Mage)c2).getManna() ); //"casting" treat c like a Mage
	//order of operations does .method before (cast). Use parentheses.

	m.setName("MAGE");
	w.setName("WARRIOR");
	m.attack(w);
	w.attack(m);
    }
}
