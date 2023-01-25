package User_input;

import java.util.Scanner;

public class Electricity_bill {
	public static void main(String args[])
	{
		double payable=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Current Reading Unit:");
		double unit=sc.nextDouble();
		

		
		if(unit>500)
		{
			payable=(unit-500)*10.0+(300*4.50)+(200*1.0);
		}
		else if(unit>200 || unit<=500)
		{
			payable=(unit-200)*4.50+(200*1.0);
		}
		else
		{
			payable=unit*1.0;
		}
		
		System.out.println("total pay:"+payable);	
			
		sc.close();
		
	}

}
