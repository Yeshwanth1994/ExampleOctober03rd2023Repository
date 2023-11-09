package Package1;

class A6
{
	String a= "ram";
	String b="sham";
	static String c="bham";
	static String d="krish";
	
}
class B6
{
	static
	{
		A6 ob=new A6();
		System.out.println(ob.a);
		System.out.println(ob.b);
		
		System.out.println(A6.c);
		System.out.println(A6.d);
		
	}
	
}
public class Question8 {

	public static void main(String[] args) {
		
		B6 ob=new B6();

	}

}
