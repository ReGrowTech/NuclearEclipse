package tues_17_jan;

import java.util.Scanner;

public class String4 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter yor Message: ");
		String n=sc.nextLine();
		//int cnt=0;
		boolean flag=false;
		
		for(int i=0; i<n.length(); i++)
		{
			char c=n.charAt(i);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				flag=true;
				System.out.println("Vovels Present in my name:"+c);
				//cnt++;
			}
		}
		if(flag==false)
		{
			System.out.println("No Vovels Present in your Message: "+n);
		}
//		System.out.println("\n");
//		System.out.println("Total number of vovels Present in meassage: "+cnt);
		//System.out.println("Total number of concenent present in message: "+(n.length()-cnt));
		sc.close();
	}

}
