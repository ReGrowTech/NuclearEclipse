package Pattern;

public class Pattern6 {

	public static void main(String args[]) {
		int n=5;
		int count=0;
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=r; c++)
			{
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
}
