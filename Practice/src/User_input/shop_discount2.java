package User_input;

import java.util.Scanner;

public class shop_discount2 {
	
	public static void main(String args[])
	{
		double cost=100;
		double payable;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Quantity in pes.");
		int que=sc.nextInt();
		
		double pay=cost*que;
		if(pay>=1000)
		{
			double dis=0.1*pay;
			payable = pay-dis;
			System.out.println("Total Amount is Rs."+pay);
		}
		else
		{
			payable= pay;
		}
		System.out.println("Total Payable amount is Rs."+payable);
		sc.close();
	}

}
