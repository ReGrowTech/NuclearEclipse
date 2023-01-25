package SwitchStatement;

public class basic_calculater {

	public static void main(String[] args) {

		int n1=100;
		int n2=50;
		char ch='/';
		
		switch(ch)
		{
		case '+':
			int sum = n1+n2;
			System.out.println("Addition of Given input: "+sum);
			break;
		case '-':
			int diff = n1-n2;
			System.out.println("Subtracting of Given input: "+diff);
			break;
		case '*':
			int pro = n1*n2;
			System.out.println("Multiplication of Given input: "+pro);
			break;
		case '/':
			int quo = n1/n2;
			System.out.println("Dividing of Given input: "+quo);
			break;
		case '%':
			int rem = n1%n2;
			System.out.println("Remeinder of given input: "+rem);
			break;
		default:
			System.out.println("Invalid Input");
			
		}
	}

}
