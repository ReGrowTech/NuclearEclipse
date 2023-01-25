package ifelse_Statement;

public class min_3 {
	public static void main(String args[])
	{
		int n1=100;
		int n2=200;
		int n3=30;
		
		if(n1<n2 && n1<n3)
		{
				System.out.println("Smallest number is:"+n1);
		}
		else if(n2<n1)
		{
			if(n2<n3)
			{
				System.out.println("Smallest number is:"+n2);
			}
		}
		else
		{
			System.out.println("Smallest number is:"+n3);
		}
	}

}
