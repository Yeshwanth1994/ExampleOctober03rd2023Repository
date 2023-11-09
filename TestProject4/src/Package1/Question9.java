package Package1;

class A7
{
	
	static {
		

				int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
				int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
			int c[][]=new int[a.length][a[0].length];
		
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[0].length;j++)
				{
					c[i][j]=a[i][j]-b[i][j];
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
			
			
		}
		
		 
	}

public class Question9 {

	public static void main(String[] args) {
		
		A7 ob=new A7();

	}

}
