package Personal;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your message: (Only Alphabet) ");
		String str=sc.nextLine();
		char st[]=str.toCharArray();
		for(int i=0; i<st.length; i++)
		{
		int cnt=1;
		if(st[i]!=1)
		{
		for(int j=i+1; j<st.length; j++)
		{
		if(st[i]==st[j])
		{
		cnt++;
		st[j]=1;
		}
		}
		System.out.println(st[i]+"  =  "+cnt);
		}
		}
		}
		}
