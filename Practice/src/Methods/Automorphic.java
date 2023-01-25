package Methods;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		int count=Armstrong.count(n);
		int automor=Automorphic.auto(n, count);
		Automorphic.check(n, automor);
		sc.close();
		
	}
	public static int auto(int x1, int x2)
	{
		int x3=x1*x1;
		int pow = (int)Math.pow(10, x2);
		x3=x3%pow;
		return (x3);
	}
public static void check(int a, int b)
{
	if(a==b)
	{
		System.out.println("Automorphic Number!");
	}
	else
	{
		System.out.println("Not Automorphic number!");
	}
}
}
