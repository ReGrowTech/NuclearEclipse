package User_input;

import java.util.Scanner;

public class shop_discount {
	
	public static void main(String[] args)
	{ 
		double rate=100.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Quantity in pes.");
		int quen=sc.nextInt();
		double total=rate*quen;
		
		if(total>=1000)
		{
			double dis=total-(total*0.1);
			System.out.println("Total Payable amount is Rs.:"+dis);
		}
		else {
			System.out.println("Total payable amount is Rs."+total);
		}
		System.out.println("Thank you for shopping.");
		sc.close();
	}

}
