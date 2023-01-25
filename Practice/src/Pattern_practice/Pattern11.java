package Pattern_practice;

public class Pattern11 {
	
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=r; c++)
			{
				if(count%2==0)
				{
				System.out.print("0 ");
				}
				else {
					System.out.print("1 ");
				}
				count++;
			}
			System.out.println();
		}
	}

}
