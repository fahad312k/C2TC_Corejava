package corejava_package;

public class exceptio_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0;
		System.out.println("hi");
		//int a=42/d;
		try
		{
			int a= 42/d;
			System.out.println("this will be not printed");
			
		}
		catch(ArithmeticException e) {
			System.out.println("division by zero");
		}
		System.out.println("this will be printed");
	}

}
