package ReGrow;

import java.util.Scanner;

public class Duck_number {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number.");
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=1; i<=n ;i++)
		{
			int ld=n%10;
			n=n/10;
			if(ld==0)
			{
				flag=true;
				
			}
			
		}
		if(flag==true)
		{
			System.out.println("It's a Duck Number.");
		}
		else
		{
			System.out.println("It's not a Duck number.");
		}
		sc.close();
	}

}
