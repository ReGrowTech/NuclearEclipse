package Pattern;

public class Pattern2 {
	public static void main(String args[]) {
		int n=3;
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n-r+1; c++)
			{
				System.out.print(" ");
			}
			for(int c1=1; c1<=r; c1++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
