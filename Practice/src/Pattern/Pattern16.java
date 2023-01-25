package Pattern;

public class Pattern16 {

	public static void main(String args[])
	{
		int n=5;
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=r;c++)
			{
				System.out.print(" ");
			}
			for(int c1=1; c1<=r;c1++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
