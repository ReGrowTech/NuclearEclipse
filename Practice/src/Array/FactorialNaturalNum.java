package Array;

public class FactorialNaturalNum {
	
	public static void main(String args[])
	{
		int arr[]=new int[5];
		for(int i=1; i<=arr.length ; i++)
		{
			int fact=1;
			for(int f=1; f<=i; f++)
			{
				fact=fact*f;
			}
			System.out.println(fact);
			
		}
	}

}
