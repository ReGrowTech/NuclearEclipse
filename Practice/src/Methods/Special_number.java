package Methods;

import java.util.Scanner;

public class Special_number {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n= sc.nextInt();
		int f=Special_number.each_digt_facto(n);
		Special_number.print(n, f);
		sc.close();
		System.out.println(f);
		
	}
	public static int each_digt_facto(int x)
	{
		int sum=0;
		while(x>0)
		{
			int ld=x%10;
			x=x/10;
			int fact=1;
			for(int i=1; i<=ld; i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
		}
		return (sum);
	}
	public static void print(int a, int b)
	{
		if(a==b)
		{
			System.out.println("Special Number!");
		}
		else
		{
			System.out.println("Not Special Number!");
		}
	}
}
