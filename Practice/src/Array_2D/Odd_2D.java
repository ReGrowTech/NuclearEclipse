package Array_2D;

public class Odd_2D {

	public static void main(String[] args) {

		int a[][]= {{12,25,24,25,19},{12,56,45,45,12},{14,13,22,76,36}};
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
				if(a[i][j]%2!=0)
				{
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
