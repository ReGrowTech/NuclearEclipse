package Array_2D;

import java.util.Scanner;

public class PresentOrNot {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number what you want to serach:");
		int n=sc.nextInt();
		int a[][]= {{24,54,68,},{59,24,46}};
		boolean flag=false;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
				if(a[i][j]==n)
				{
					flag=true;
					break;
				}
			}
		}
			if(flag==true)
			{
				System.out.println(n+" Is Present in 2D Array!");
			}
			else
			{
				System.out.println(n+" Is not Present in 2D Array!");
			}
		sc.close();
	}
}
