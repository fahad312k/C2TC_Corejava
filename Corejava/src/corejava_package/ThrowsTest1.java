package corejava_package;
import java.io.IOException;

public class ThrowsTest1 {
	static void display()throws IOException
	{
		System.out.println("hello java");
		throw new IOException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsTest1 obj = new ThrowsTest1();
		try
		{
			obj.display();
		}
		catch(IOException e) {
			System.out.println("caught an exception:/n" +e);
			
		}
		

	}

}
