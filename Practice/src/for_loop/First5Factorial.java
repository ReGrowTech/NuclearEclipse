package for_loop;

public class First5Factorial {

	public static void main(String[] args) {

		for(int i=1; i<=5;i++)
		{
			int fact=1;
			for(int n=1; n<=i;n++)
			{
				fact=fact*n;
			}
			System.out.println(fact);
		}
	}

}
