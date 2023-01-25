package ifelse_Statement;

public class Leap_year_2 {

	public static void main(String[] args) {

		int year = 2002;
		if((year%100==0 && year%400==0) || (year%100!=0 && year%4==0))
		{
			System.out.println("Given Year is a leap year.");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}

}
