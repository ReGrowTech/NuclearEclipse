package wed_18_jan;

import java.util.Scanner;

public class Count_Spaces {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Meassage: ");
		String a=sc.nextLine();
		int res=count(a);
		System.out.println("Total Spaces is Your Message: "+res);
		sc.close();
	}
	public static int count(String str)
	{
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				cnt++;
			}
		}
		return (cnt);
	}

}
