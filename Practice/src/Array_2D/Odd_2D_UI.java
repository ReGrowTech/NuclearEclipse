package Array_2D;

import java.util.Scanner;

public class Odd_2D_UI {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][5];
		System.out.println("Enter yor element");
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
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
sc.close();
	}
	}

