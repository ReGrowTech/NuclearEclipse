package ReGrow;

import java.util.Scanner;

public class Aumor1ton {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your last limit:");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			int a=i;
			int a2=i;
			int a1=i*i;
			int count=0;
			
			while(a>0)
			{
				a=a/10;
				count++;
			}
			int power=(int)Math.pow(10, count);
			a1=a1%power;
			
			if(a1==a2)
			{
				System.out.println(a1);
			}
			sc.close();
		}
		
	}
}
