package for_loop;

import java.util.Scanner;

public class Table {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int pro=1;
		System.out.println("Your Table is:");
		for(int i=1;i<=10;i++)
		{
			pro=n*i;
			System.out.println(n+"X"+i+"="+pro);
		}
		sc.close();
	}

}
