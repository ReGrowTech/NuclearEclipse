package Array;

import java.util.Scanner;

public class Max_Min_array {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Array Limit:");
		int n=sc.nextInt();
		System.out.println("Enter you "+n+" element contiosly:");
		int arr[]=new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int j=1; j<arr.length; j++)
		{
			if(arr[j]>max)
			{
				max=arr[j];
			}
			if(arr[j]<min)
			{
				min=arr[j];
			}
		}
		System.out.println("maximum number :"+max);
		System.out.println("Minimum number :"+min);
		sc.close();
	}
}
