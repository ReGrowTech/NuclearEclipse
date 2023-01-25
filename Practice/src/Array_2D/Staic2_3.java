package Array_2D;

public class Staic2_3 {

	public static void main(String[] args) {

		int arr[][]= {{24,26,45},{12,42,78}};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
