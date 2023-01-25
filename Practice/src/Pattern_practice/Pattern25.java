package Pattern_practice;

public class Pattern25 {
	
	public static void main(String args[])
	{
		int n=9;
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(" ");
			}
			for(int a=1; a<=n-r+1; a++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
