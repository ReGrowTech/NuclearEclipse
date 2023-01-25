package Pattern;

public class Pattern8 {
	
	public static void main(String args[]) {
		int n=5;
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=r; c++)
			{
				if(c%2==0)
				{
					System.out.print("0 ");
				}
				else
				{
				System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}

}
