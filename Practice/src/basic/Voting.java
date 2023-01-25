package basic;

public class Voting {
	public static void main(String args[]) {
		
		int a=59;
		
		if(a>101)
		{
			System.out.println("Thank you.");
		}
		else if(a<=101 && a>=60)
		{
			System.out.println("Seniur Citizen Yes");
		}
		else if(a<60 && a>20)
		{
			System.out.println("Adult Citizen Yes");
		}
		else
		{
			System.out.println("No.");
		}
	}

}
