package SwitchStatement;

import java.util.Scanner;

public class calculater2 {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your First Number:");
		int n1 = sc.nextInt();
		
		System.out.println("Enter Your Secound Number:");
		int n2 = sc.nextInt();
		
		System.out.println("Enter Your Choice: ");
		System.out.println("Press \"+\" for Adding: ");
		System.out.println("Press \"-\" for Subtracting: ");
		System.out.println("Press \"*\" for Multiplication: ");
		System.out.println("Press \"/\" for Division: ");
		System.out.println("Press \"%\" for Reminder: ");
		char res = sc.next().charAt(0);
		
		switch(res)
		{
		case '+':
			int add=n1+n2;
			System.out.println("Addition of your given input: "+add);
			break;
			
		case '-':
			int diff=n1-n2;
			System.out.println("Subtraction of your given input: "+diff);
			break;
			
		case '*':
			int pro=n1*n2;
			System.out.println("Product of your given input: "+pro);
			break;
			
		case '/':
			int quo=n1/n2;
			System.out.println("Quentient of your given input: "+quo);
			break;
			
		case '%':
			int rem=n1%n2;
			System.out.println("Reminder of your given input: "+rem);
		default:
			System.out.println("Error choice!");
				
		}
		sc.close();
	}

}
