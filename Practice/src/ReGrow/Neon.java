package ReGrow;

import java.util.Scanner;

public class Neon {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int n1=n*n;
		//int n2=n;
		int sum=0;
		
		while(n1>0)
		{
			int ld = n1%10;
			n1=n1/10;
			sum=sum+ld;
		}
		if(sum==n)
		{
			System.out.println(n+" is a Neon Number.");
		}
		else
		{
			System.out.println(n+" is Not a Neon Number.");
		}
		sc.close();
	}

}
