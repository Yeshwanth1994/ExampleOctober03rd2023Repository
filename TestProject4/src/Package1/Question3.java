package Package1;

class A1
{
	void display()
	{
		
		System.out.println("Instance method");
	}
	{
		System.out.println("Instance block");
	}
	
}
class B1
{
	static void show()
	{
		A1 ob=new A1();
		ob.display();
		
	}
}
public class Question3 {

	public static void main(String[] args) {
		
		B1.show();
	}

}
