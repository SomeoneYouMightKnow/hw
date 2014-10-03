public class Driver {
    public static void main(String[] args){
	Shapes s = new Shapes();
	System.out.print(s.box(4,5));
	System.out.print(s.box(5,6));
	System.out.print(s.tri1(5));
	System.out.print(s.tri1(6));
	System.out.print(s.tri1(7));
	System.out.print(s.tri2(5));
	System.out.print(s.tri2(6));
	System.out.print(s.tri2(7));
	System.out.print(s.tri3(5));
	System.out.print(s.tri3(6));
	System.out.print(s.tri3(7));
	System.out.print(s.diamond(5));
	System.out.print(s.diamond(6));
	System.out.print(s.diamond(7));
	System.out.print(s.tri4(5));
	System.out.print(s.tri4(6));
	System.out.print(s.tri4(7));
    }

}
