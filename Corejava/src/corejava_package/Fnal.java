package corejava_package;

	class a
{
 final	void run()
	{
		
	}
 
	
}
public class Fnal extends a
{
int speedlimit=90;
void run()
{
	speedlimit=150;
	System.out.println("the speedlimit is:"+speedlimit);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fnal ob1=new Fnal();
ob1.run();
	}


}
