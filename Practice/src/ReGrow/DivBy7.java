package ReGrow;

import java.util.Scanner;

public class DivBy7 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Limit:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%7==0)
			{
				System.out.print(i+",");
			}
		}
		sc.close();
	}

}
