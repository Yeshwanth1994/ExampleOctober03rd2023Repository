package Package1;

class A3
{
	static
	{
		
		System.out.println("static block");
	}
	static void display1()
	{
		System.out.println("Static method");
	}
	
}
class B3
{
	
	{
		
		A3.display1();
	}
}
public class Question5 {

	public static void main(String[] args) {
	
		B3 ob=new B3();

	}

}
