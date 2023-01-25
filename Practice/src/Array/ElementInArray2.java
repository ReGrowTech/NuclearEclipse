package Array;

import java.util.Scanner;

public class ElementInArray2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter yor number what you want to find in array:");
		int arr[]= {10,58,45,56,281};
		int n=sc.nextInt();
		boolean flag=false;
		
		for(int i=0; i< arr.length ;i++)
		{
			if(arr[i] == n)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Given Element is Founded.");
		}
		else
		{
			System.out.println("Given Element not in Founded.");
		}
		sc.close();
	}

}
