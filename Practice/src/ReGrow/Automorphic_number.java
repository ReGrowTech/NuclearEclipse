package ReGrow;

import java.util.Scanner;

public class Automorphic_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
		int n1=n*n;
		int n2=n;
		
		while(n>0)
		{
			n=n/10;
			count++;
		}
		
		int pow=(int)Math.pow(10, count);
		n1=n1%pow;
		if(n1==n2)
		{
			System.out.println("Automorphic number");
		}
		else
		{
			System.out.println("Not a Automorphic Number");
		}
		sc.close();
	}

}
