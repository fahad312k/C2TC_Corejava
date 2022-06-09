package corejava_package;

public class MultiCatchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= new int[6];
			arr[3]= 20/0;
			System.out.println("i am in try block");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("a number cannot be divided be zero,illegal operation in java");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Accessing array element outside of specified limit");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("i am out of try-catch block");
		}

	}


