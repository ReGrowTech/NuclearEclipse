package Array;

import java.util.Scanner;

public class Odd_number {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your 5 element continusly:");
		int arr[]=new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Odd Number are given below: ");
		for(int j=0; j<arr.length; j++)
		{
			if(arr[j]%2!=0)
			{
				System.out.println(arr[j]);
			}
		}
		sc.close();
	}

}
