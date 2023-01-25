package sundayfunday;

import java.util.Scanner;

public class SahidBhai {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int cnt=0;
		while(n>0)
		{
			n=n/10;
			cnt++;
		}
		System.out.println(cnt);
		int c=0;
		for(int i=1; i<=cnt; i++)
		{
			//int c=0;
			if(cnt%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println(cnt+"is prime no.");
		}
		else
		{
			System.out.println(cnt+"is not prime number.");
		}
	}

}
