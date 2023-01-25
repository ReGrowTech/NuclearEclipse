package User_input;

import java.util.Scanner;

public class Swap2No {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int n2=sc.nextInt();
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("Now your first number is: "+n1);
		System.out.println("Now your Second number is: "+n2);
		
		sc.close();
		
	}

}
