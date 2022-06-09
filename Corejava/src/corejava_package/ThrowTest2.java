package corejava_package;

public class ThrowTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 20;
		int y = 0;
		try {
			int z= x/y;
			System.out.println("result:"+z);
			throw new ArithmeticException();
			//ArithmeticException a=new ArithmeticException("hellow from throw"); 
			//throw a;
		}
		catch(ArithmeticException a)
	
		{
			System.out.println("ArithmeticException caught:\n"+a);
		
		}
	}

}
