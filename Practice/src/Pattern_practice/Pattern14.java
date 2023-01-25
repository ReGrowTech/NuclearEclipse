package Pattern_practice;

public class Pattern14 {
	
	public static void main(String args[])
	{
		int n=5;
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n-r+1; c++)
			{
				System.out.print(6-c-r+1+" ");
			}
			System.out.println();
		}
	}

}
