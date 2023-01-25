package Personal;

import Methods.Armstrong;

public class Static_nonStatic {
	
	public static void main(String args[])
	{
		int n=156;
		//Armstrong.count(n);
		System.out.println(Armstrong.count(n));
		
		Armstrong sd=new Armstrong();
		int sum=sd.count(n);
	}

}