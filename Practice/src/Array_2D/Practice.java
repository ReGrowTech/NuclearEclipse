package Array_2D;

import java.util.Scanner;

public class Practice {

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Array Lenth N*N Form: ");
		int n=sc.nextInt();
		System.out.println("Enter your array Continusly: ");
		int arr[][]=new int[n][n];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j]=sc.nextInt();			
			}
		}
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
