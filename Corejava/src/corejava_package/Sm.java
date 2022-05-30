package corejava_package;

public class Sm {
	static int j=50;
	
	int n=100;
	
	static void A()
	{
		int a=10;
		System.out.println("a="+a);
		
		//n=100;
		//i();
		
	}

	void i()
	{
		
		System.out.println("inside i");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sm ob=new Sm();
		ob.i();
		Sm.A();
		

	}

}
