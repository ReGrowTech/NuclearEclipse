package Array;

import java.util.Scanner;

public class InputArrayDivBy6 {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter Element for array: ");
		
		for(int i=0; i< arr.length ; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("number div by 6 are:");
		for(int j=0; j< arr.length ; j++)
		{
			if(arr[j]%6==0)
			{
				System.out.println(arr[j]+" Is divisible by 6. ");
			}
		}
		sc.close();
	}

}
