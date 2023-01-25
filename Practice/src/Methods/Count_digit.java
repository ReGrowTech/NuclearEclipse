package Methods;

import java.util.Scanner;

public class Count_digit {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		int count=Armstrong.count(n);
		System.out.println("Total no. Present in your input: "+count);
		sc.close();
	}

}
