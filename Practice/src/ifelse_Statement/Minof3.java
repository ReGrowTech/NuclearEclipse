package ifelse_Statement;

public class Minof3 {
	
	public static void main(String args[])
	{
		int n1 = 100;
		int n2 = 20;
		int n3 = 3000;
		
		if(n1<n2 && n1<n3)
		{
			System.out.println("Number 1 hava minimum value ");
		}
		else if(n2<n3 && n2<n1)
		{
			System.out.println("Number 2 hava minimum value");
		}
		else
		{
			System.out.println("Number 3 hava minimum value");
		}
	}

}
