package while_loop;

import java.util.Scanner;

public class ProductAlldigit {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		int sum=1;
		
		while(n>0)
		{
			int ld=n%10;
			sum=sum*ld;
			n=n/10;
		}
		System.out.println("Product of given input is:"+sum);
		sc.close();
	}

}
