package Methods;

import java.util.Scanner;

public class Armstrong {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		int cnt=Armstrong.count(n);
		int a=Armstrong.Arm(n,cnt);
		Armstrong.printing(n, a);
		sc.close();
		
	}
	
	public static int count(int x)
	{
		int c=0;
		while(x>0)
		{
			x=x/10;
			c++;
		}
		return (c);
	}
	
	public static int Arm(int x1, int x2)
	{
		int sum=0;
		while(x1>0)
		{
			int ld=x1%10;
			x1=x1/10;
			int Sum_ld=(int)Math.pow(ld, x2);
			sum=sum+Sum_ld;
		}
		return (sum);
	}
	public static void printing(int a1, int b1)
	{
		if(a1==b1)
		{
			System.out.println("Armstrong Number!");
		}
		else
		{
			System.out.println("Not Armstrong Number!");
		}
	}

}
