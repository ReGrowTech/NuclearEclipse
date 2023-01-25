package Array_2D;

import java.util.Scanner;

public class UserInput_Raw_column {

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your number(It's your raw and column structure):");
		int n=sc.nextInt();
		System.out.println("Enter your element continusly: ");
		int a[][]=new int [n][n];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i][1]);
		}
	}

}
