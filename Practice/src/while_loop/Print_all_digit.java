package while_loop;

import java.util.Scanner;

public class Print_all_digit {
	
	public static void main(String args[]) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int num = sc.nextInt();
		
		while(num>0)
		{
			int res=num%10;
			System.out.println(res);
			num=num/10;
		}
		sc.close();
		
		
		
	}

}
