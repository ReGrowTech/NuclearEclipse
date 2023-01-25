package ifelse_Statement;

public class CharacterIsAlphabet {
	
	public static void main(String args[]) {
		
		char ch = 'Z';
		
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
		{
			System.out.println("Given Input is a Character Type");
		}
		else
		{
			System.out.println("Given Input is not a Character type");
		}
	}

}
