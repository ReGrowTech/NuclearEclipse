package wed_18_jan;

import java.util.Scanner;

public class IntegerCompareIntoString {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number: ");
		int n=sc.nextInt();
		String s=String.valueOf(n);
		//System.out.println(n);
		String res=PallingdromString.rev(s);
		if(res.equals(s))
		{
			System.out.println("String is pallingdrome:");
		}
		else
		{
			System.out.println("Not Pallingdrome:");
		}
		
		sc.close();
		
	}

}
