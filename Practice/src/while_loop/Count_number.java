package while_loop;

import java.util.Scanner;

public class Count_number {
	
	public static void main(String args[])
	{
		long count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number what you count:");
		long num = sc.nextLong();
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Total Digits in your input: "+count);
		sc.close();
	}

}
