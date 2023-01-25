package Pattern;

public class Pattern3 {
	public static void main(String args[])
	{
		int n=5;
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(64+c+" ");
			}
			System.out.println();
		}
	}

}
