package SwitchStatement;

import java.util.Scanner;

public class Input_age_name {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter Your Age:");
		//int age = s.nextInt();
		//s.nextLine();
		System.out.println("\"Enter Your name:\" ");
		String name=s.nextLine();
		System.out.println("Enter Your Age:");
		int age = s.nextInt();
		
		System.out.print("I am \""+name+"\"\nI am "+age+" Years old.");
		s.close();
		
	}
}
