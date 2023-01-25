package Pattern_practice;

public class Pattern17 {
	
	public static void main(String args[])
	{
		int n=5;
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n-r+1; c++)
			{
				System.out.print(" ");
			}
			for(int a=1; a<=r; a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
