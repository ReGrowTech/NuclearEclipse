package Methods;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		Reverse_number.rev(n);
		System.out.println(Reverse_number.rev(n));
		sc.close();
		
	}
	public static int rev(int x)
	{
		int rev=0;
		while(x>0)
		{
			int ld=x%10;
			x=x/10;
			rev=(rev*10)+ld;
		}
		return (rev);
	}
	

}
