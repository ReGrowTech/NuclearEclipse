package sundayfunday;

import java.util.Scanner;

public class FrequencyString {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String: ");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		System.out.println("Your Frequency of each element: ");
		for(int i=0;i<ch.length;i++)
		{
			int cnt=1;
			if(ch[i]!='@' && ch[i]!=' ')
			{
				for(int j=i+1; j<ch.length; j++)
				{
					if(ch[i]==ch[j])
					{
						cnt++;
						ch[j]='@';
					}
				}
				System.out.println(ch[i]+" = "+cnt);
			}
		}
		sc.close();
		
	}

}
