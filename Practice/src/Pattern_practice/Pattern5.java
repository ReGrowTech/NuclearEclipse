package Pattern_practice;

public class Pattern5 {
	
	public static void main(String args[])
	{
		int n=4;
		int count=1;
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}

}
