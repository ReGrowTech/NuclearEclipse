package Pattern_practice;

public class Pattern21 {
	
	public static void main(String args[])
	{
		int n=5;
		int k=0;
		for(int r=1; r<=n; r++)
		{
			k=r;
			for(int c=1; c<=n-r+1; c++)
			{
				System.out.print((char)(c+k+r-2+64)+" ");
			}
			System.out.println();
		}
	}

}
