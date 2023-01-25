package ReGrow;

import java.util.Scanner;

public class Swapping_without3rd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your 1st No.:");
		int num1=sc.nextInt();
		System.out.println("Enter your 2nd No.:");
		int num2=sc.nextInt();
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("Now your First number is: "+num1);
		System.out.println("Now your Second number is: "+num2);
		sc.close();
	}

}
