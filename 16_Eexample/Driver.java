public class Driver{

    public static void main(String[] args){

	Eexample ee = new Eexample();

	System.out.println("Before error test");
	
	try{
	    //ee.etest(1);
	    ee.etest(11);
	    System.out.println("call to etest finished");
	} catch (/* Exception */ /* ArithmeticException  */ IndexOutOfBoundsException e ) {
	    System.out.println("IOB crashed with: "+e);
	} catch (ArithmeticException e) {
	    System.out.println("Arith crashed with: "+e);
	} catch ( Exception e) {
	    System.out.println("Catch-all crashed with: "+e);
	}
	
	System.out.println("After the error test");

    }



}
