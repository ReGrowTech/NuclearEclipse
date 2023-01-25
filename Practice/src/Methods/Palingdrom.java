package Methods;

import java.util.Scanner;

public class Palingdrom {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a =sc.nextInt();
		//int b=Reverse_number.rev(a);
		Palingdrom.check(a,Reverse_number.rev(a));
		sc.close();
		
	}
	public static void check(int x, int y)
	{
		if(x==y)
		{
			System.out.println("Palingdrom number!");
		}
		else
		{
			System.out.println("Not Same Number!");
		}
	}

}
