package thurs_19_jan;

import java.util.Scanner;

public class Reverse_word {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your message here: ");
		String s=sc.nextLine();
		s=s.trim().replaceAll("\s+", " ");
		//s=s.replaceAll("\s+"," ");
		String s1[]=s.split(" ");
		String s2="";
		for(String each:s1)
		{
			s2=each+" "+s2;
		}
		System.out.println(s2);
		sc.close();
	}

}
