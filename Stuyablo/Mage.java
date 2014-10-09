public class Mage extends Basechar{
    private int manna = 12345;
    public Mage(){
	setName("Paul");
    }
    public Mage(String n){
        setName(n);
    }
    public Mage(String n, int m){
	sername(n);
	manna = m;
    }
    public int getManna(){
	return manna;
    }
}
