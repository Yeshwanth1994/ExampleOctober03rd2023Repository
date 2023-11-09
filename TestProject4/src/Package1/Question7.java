package Package1;

class A5
{
	
	static void display()
	{
		System.out.println("Static method 1");
	}
	static void display1()
	{
		System.out.println("Static method 2");
	}
	
}
class B5{
	B5( )
	{
		A5.display();
		A5.display1();
		
	}
}
public class Question7 {

	public static void main(String[] args) {
		
			B5 ob=new B5();
	}

}
