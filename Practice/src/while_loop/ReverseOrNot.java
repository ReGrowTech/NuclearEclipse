package while_loop;

import java.util.Scanner;

public class ReverseOrNot {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		int n = sc.nextInt();
		int rev=0;
		int num=n;
		
		while(n>0)
		{
			int ld = n%10;
			rev = (rev*10)+ld;
			n=n/10;
		}
		if(rev==num)
		{
			System.out.println("It's a Palingdrom Number");
		}
		else
		{
			System.out.println("It's not a palingdrom number");
		}
		sc.close();
	}

}
