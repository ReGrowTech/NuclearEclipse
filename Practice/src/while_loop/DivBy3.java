package while_loop;

import java.util.Scanner;

public class DivBy3 {

	public static void main(String args[])
	{
		int sn=1; //sn=starting number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your last limit:");
		int ln = sc.nextInt(); //ln=last limit of number
		
		while(sn<=ln)
		{
			if(sn%3==0)
			{
				System.out.println(sn);
			}
			sn++;
		}
		sc.close();
	}
}
