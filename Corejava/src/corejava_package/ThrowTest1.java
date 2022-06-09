package corejava_package;

public class ThrowTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ArithmeticException a = new ArithmeticException ("hello from throw");
			throw a;
		}
			// or 
		//throw new ArithmeticException("hello from throw");
		catch(ArithmeticException a)
		{
			System.out.println("ArithmeticException caught:/n " +a);
			System.out.println(a.getMessage());
		}
		
	}

}
