package Pattern;

public class Pattern18 {
	
	public static void main(String args[])
	{
		int n=3;
		int count=6;
		for(int r=1; r<=n; r++)
		{
			for(int c1=1;c1<=n-r+1;c1++)
			{
				System.out.print(" ");
			}
			for(int c=1; c<=r; c++)
			{
				System.out.print(count+" ");
				count--;
			}
			System.out.println();
		}
	}

}
