package Pattern;

public class Pattern {

	public static void main (String args[])
	{
		int n=3;
		for(int r=1; r<=n ;r++)
		{
			for(int c=1; c<=n-r+1 ; c++)
			{
				System.out.print(" ");
			}
			
			for(int c=1; c<=r; c++)
			{
				if(r%2==0)
				{
				System.out.print("# ");
				}
				else
				{
					System.out.print("* ");
				}
			}
		System.out.println();
		}
	}
}
