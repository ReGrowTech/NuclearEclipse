package ReGrow;

import java.util.Scanner;

public class Palindrom_String {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a message:");
	String str=sc.nextLine();
	String result=reverse(str);
	System.out.println(result);
	if(result.equals(str))
	{
	System.out.println("Palindrom String");
	}
	else
	{
	System.out.println("Not Palindrom");
	}
	}


	public static String reverse(String str)
	{
	String a="";
	for(int i=0; i<str.length(); i++)
	{
	char ch = str.charAt(i);
	a=ch+a;
	}
	return a;
	}
	}