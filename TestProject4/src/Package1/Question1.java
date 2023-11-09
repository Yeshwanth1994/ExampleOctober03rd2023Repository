package Package1;

class Instanceblock
{
	{
		Staticblock ob=new Staticblock();
		System.out.println("Instance block");
	}
}
class Staticblock
{
	static
	{
		System.out.println("Static block");
	}
}
public class Question1 {

	public static void main(String[] args) {
		
		Instanceblock ob=new Instanceblock();

	}

}
