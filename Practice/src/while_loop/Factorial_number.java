package while_loop;

import java.util.Scanner;

public class Factorial_number {
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
			
			int fact=1;
			int i=1;
			while(i<=n)
			{
				fact=fact*i;
				i++;
			}
			System.out.println(fact);
			sc.close();
		}

}
