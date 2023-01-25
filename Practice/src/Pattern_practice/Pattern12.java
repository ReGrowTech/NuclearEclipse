package Pattern_practice;

public class Pattern12 {
	
	public static void main(String args[])
	{
		int n=4;
		int count=10;
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=n-r+1; c++)
			{
				System.out.print(count+" ");
				count--;
			}
			System.out.println();
		}
	}

}
