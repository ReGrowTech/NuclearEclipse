package Pattern_practice;

public class Pattern15 {
	
	public static void main(String args[])
	{
		int n=4;
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=r; c++)
			{
				if(r%2==0)
				{
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
