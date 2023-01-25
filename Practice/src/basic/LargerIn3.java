package basic;

public class LargerIn3 {
	public static void main(String args[])
	{
		int n1=1000;
		int n2=200;
		int n3=3000;
		
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1+"is Biggest no.");
		}
		
		else if(n2>n1 && n2>n3)
		{
			System.out.println(n2+"IS biggest no.");
		}
		else
		{
			System.out.println(n3+"IS biggest no.");
		}
	}

}
