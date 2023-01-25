package ifelse_Statement;

public class CharIsNumber2 {

	public static void main(String[] args) {

		char ch='0';
		int a=ch;
		if(a>=48 && a<=57)
		{
			System.out.println("Given Character is a Numberic value");
		}
		else {
			System.out.println("not a number");
		}
	}

}
