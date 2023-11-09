package Package1;


class A4
{
	
	{
		
		System.out.println("Instance block");
	}
	 A4()
	{
		System.out.println("no args constructor");
	}
	 static
	 {
		 System.out.println("Static block");
	 }
	
}
public class Question6 {

	public static void main(String[] args) {
		
		A4 ob=new A4();
	}

}
