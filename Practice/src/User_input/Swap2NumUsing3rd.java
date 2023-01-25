package User_input;

import java.util.Scanner;

public class Swap2NumUsing3rd {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n1=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int n2= sc.nextInt();
		
		int ext;

		ext=n1;
		n1=n2;
		n2=ext;
		
		System.out.println("1st number is: "+n1);
		System.out.println("2nd number is: "+n2);
		
		sc.close();
	}

}
