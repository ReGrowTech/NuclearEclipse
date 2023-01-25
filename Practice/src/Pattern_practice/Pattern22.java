package Pattern_practice;

public class Pattern22 {
	
	public static void main(String args[])
	{
		int n=9;
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n-r+1; c++)
			{
				System.out.print(" ");
			}
			for(int a=1; a<=r; a++)
			{
				System.out.print(r+" ");
			}
			System.out.println();
		}
	}

}
