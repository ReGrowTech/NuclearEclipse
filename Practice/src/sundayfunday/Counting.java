package sundayfunday;

import java.util.Scanner;

public class Counting {

	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your message: ");
		String str=sc.nextLine();
		char word[]=str.toCharArray();
		System.out.println(word.length);
		//str=str.trim().replaceAll("\\s+","");
//		System.out.println(str);
//		System.out.println(str.length());
//		String word[]=str.split(" ");
//		System.out.println(str);
//		System.out.println(word.length);
//		char arr[]=str.toCharArray();
//		System.out.println(arr.length);
	}
}
