package ReGrow;

import java.util.Scanner;

public class Swapping_using_3rd {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your First number:");
		int num1=sc.nextInt();
		System.out.println("Enter your Second number:");
		int num2=sc.nextInt();
		
		int extra;
		extra=num1;
		num1=num2;
		num2=extra;
		
		System.out.println("Now my First Number is: "+num1);
		System.out.println("Now my Second number is: "+num2);
		sc.close();
	}

}
