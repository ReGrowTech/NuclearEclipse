package ifelse_Statement;

public class Leap_year {

	public static void main(String[] args) {

		int y=2000;
		if(y%100==0)
		{
			if(y%400==0)
			{
				System.out.println("Given year is Leap year");
			}
			else
			{
				System.out.println("Given Year is Not a Leap year");
			}
		}
		else {
				if(y%4==0)
				{
					System.out.println("It's also leap year");
				}
				else
				{
					System.out.println("It's not a leap year");
				}
			}
			
		}
	}
