package Pattern_practice;

public class Pattern28 {
	public static void main(String args[])
	{
		int n=5;
		for(int r=1;r<=n;r++)
		{
			for(int c=1; c<=n-r+1 ;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int r1=1; r1<=n; r1++)
		{
			for(int c1=1; c1<=r1; c1++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
