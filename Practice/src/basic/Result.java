package basic;

public class Result {
	
	public static void main(String args[])
	{
		int a = 40;
		if(a<=100 && a>=70)
		{
			System.out.println("1\"st\"");
		}
		else if(a<70 && a>=50)
		{
			System.out.println("2nd");
		}
		else if(a<50 && a>=30)
		{
			System.out.println("3rd");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
