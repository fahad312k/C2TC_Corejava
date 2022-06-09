package corejava_package;

public class NestedTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "welcome";
int x[]= {0,1,2,3,4};

//outer try block
try {
	int slength = str.length();
	System.out.println("String length: "+slength);
	
	//inner try block
	try {
		int y =6;
		System.out.println(x[y]);
	}
	
	//inner catch block
	catch(ArithmeticException ea)
	{
		System.out.println("Exception thrown");
		System.out.println(ea.toString());
	}
}

//outer catch block
catch(ArrayIndexOutOfBoundsException ale) {
	System.out.println("Exception thrown");
	System.out.println(ale.toString());
}
System.out.println("i am out of outer catch block");
}
	}


