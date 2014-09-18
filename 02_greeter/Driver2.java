public class Driver2 {
    public static void main(String[] args) {
	Greeter2 g1 = new Greeter2();
	Greeter2 g2 = new Greeter2();
	g1.greet();
	g2.greet();
	//g1.greeting = new String ("Hi world!");
	//won't work if greeting is private (which it is)
	g1.setGreeting("Sup!");
	g2.setGreeting("HI!");
	g1.greet();
	g2.greet();

	String s = g1.getGreeting();
	System.out.println("g1's greeting is: " + s);

	System.out.println("g2's greeting is: " + g2.getGreeting());

    }
}

