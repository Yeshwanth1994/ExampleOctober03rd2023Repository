package Package1;

class A2
{
	void display()
	{
		
		System.out.println("Instance method");
	}
	static void display1()
	{
		System.out.println("Static method");
	}
	
}
class B2{
	B2(int a,int b )
	{
		A2 ob=new A2();
		ob.display();
		A2.display1();
		System.out.println(a);
		System.out.println(b);
	}
}
public class Question4 {

	public static void main(String[] args) {
		
		B2 obj=new B2(5,7);
		

	}

}
