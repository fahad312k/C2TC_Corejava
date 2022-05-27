package corejava_package;

public class PolyExample {

	public static void main(String[] args) {
		A a =  new A();
		B b = new B();
		b.run();
	}

}
class A
{
	void run()
	{
		System.out.println("Hi");
	}
}
class B extends A
{
	void run()
	{
		System.out.println("Hello");
		
	}

	}

