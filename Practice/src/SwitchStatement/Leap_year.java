package SwitchStatement;

import java.util.Scanner;

public class Leap_year {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Plese enter given year: 'YYYY':");
		int year = sc.nextInt();
		
		if((year%100!=0 && year%4==0)||(year%400==0))
		{
			System.out.println("Given year is Leap Year.");
		}
		else
		{
			System.out.println("Given year is not a lepa year.");
		}
		sc.close();
	}

}
