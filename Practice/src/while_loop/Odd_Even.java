package while_loop;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String args[])
	{
		int n=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your last number where what to you print:");
		int ln=sc.nextInt();
		while(n<=ln)
		{
			if(n%2!=0)
			{
				System.out.println("Odd Number is:"+n);
			}
			else if(n%2==0)
			{
				System.out.println("Even number is: "+n);
			}
			n++;
		}
		sc.close();
	}
}
