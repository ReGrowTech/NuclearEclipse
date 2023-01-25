package tues_17_jan;

import java.util.Scanner;

public class String5 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Message: ");
		String n=sc.nextLine();
		String a="";
		
		for(int i=0; i<n.length(); i++)
		{
			char b=n.charAt(i);
			a=b+a;
			
		}
		System.out.println(a);
		sc.close();
	}

}
