package wed_18_jan;

import java.util.Scanner;

public class CallingStaticNonstatic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your message: ");
		String s=sc.nextLine();
		int res=Count_Spaces.count(s);//calling static method.
		System.out.println("Total Spaces in your Message: "+res);
		
		int n=12457;
		CallingStaticNonstatic an=new CallingStaticNonstatic();
		int r=an.count(n);
		System.out.println("Total digits in my integer: "+ r);
		sc.close();

	}

	public int count(int a)
	{
		int cnt=0;
		while(a>0)
		{
			a=a/10;
			cnt++;
		}
		return (cnt);
	}
}
