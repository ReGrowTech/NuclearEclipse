package sundayfunday;

import java.util.Scanner;

public class LeapYear {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year=sc.nextInt();
		LeapYear lp=new LeapYear();
		boolean flag=lp.leap(year);
		if(flag==true)
		{
			System.out.println("Given Input is Leap Year!");
		}
		else
		{
			System.out.println("Given input is not a leap year!");
		}
		sc.close();
	}
	
	public  boolean leap(int n)
	{
		boolean flag=false;
		if((n%100==0 && n%400==0)||(n%100!=0 && n%4==0))
		{
			flag=true;
		}
		return (flag);
	}
}
