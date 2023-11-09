package Package1;

class A
{
	{
		
		System.out.println("Instance block");
	}
	static
	{
		System.out.println("Static block");
	}
}
class B
{
	void display()
	{
		A ob=new A();
		
	}
	
}

public class Question2 {

	public static void main(String[] args) {
		
		B obj=new B();
		obj.display();

	}

}
