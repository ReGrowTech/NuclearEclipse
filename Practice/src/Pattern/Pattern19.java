package Pattern;

public class Pattern19 {
	public static void main(String args[])
	{
		int n=4;
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n-r+1; c++)
			{
				System.out.print(" ");
			}
			for(int c1=1; c1<=r; c1++)
			{
				if(r%2==0) {
				System.out.print("* ");
				}
				else
				{
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}

}
