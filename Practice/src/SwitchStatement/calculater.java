package SwitchStatement;

import java.util.Scanner;

public class calculater {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your First Number: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Enter Your Secound Number: ");
		double n2 = sc.nextDouble();
		
		System.out.println("Enter Your Choice: ");
		System.out.println("Press 1 for Adding: ");
		System.out.println("Press 2 for Subtracting: ");
		System.out.println("Press 3 for Multiplication: ");
		System.out.println("Press 4 for Division: ");
		System.out.println("Press 5 for Reminder: ");
		int res = sc.nextInt();
		
		switch(res)
		{
		case 1:
			double add=n1+n2;
			System.out.println("Addition of your given input: "+add);
			break;
			
		case 2:
			double diff=n1-n2;
			System.out.println("Subtraction of your given input: "+diff);
			break;
			
		case 3:
			double pro=n1*n2;
			System.out.println("Product of your given input: "+pro);
			break;
			
		case 4:
			double quo=n1/n2;
			System.out.println("Quentient of your given input: "+quo);
			break;
			
		case 5:
			double rem=n1%n2;
			System.out.println("Reminder of your given input: "+rem);
			break;
			
		default:
			System.out.println("Error choice!");
				
		}
		sc.close();
	}

}
