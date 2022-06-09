package corejava_package;

public class Const1 {
Const1(){
	System.out.println("Default constructor");
}
Const1(int i, int j){
	System.out.println("constructor with Two parameters");
	
}
Const1(int i, int j, int k){
	System.out.println("constructor with three parameters");
}
Const1(int i, String name){
	System.out.println("constructor with int and string");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Const1 ob1= new Const1();
		Const1 ob2= new Const1(12 , 11
				);
		Const1 ob3= new Const1(12, 13, 14);
		Const1 ob4= new Const1(12, "fahad");
		

	}

}
