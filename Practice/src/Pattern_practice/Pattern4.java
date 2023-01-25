package Pattern_practice;

public class Pattern4 {
	
	public static void main(String args[])
	{
		int n=4;
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(r*2+" ");
			}
			System.out.println();
		}
	}

}
