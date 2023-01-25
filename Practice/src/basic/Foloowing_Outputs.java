package basic;

public class Foloowing_Outputs {
	
	public static void main(String args[]){
		{
			System.out.println("ReGrow"+1+2);
			System.out.println(1+2+"ReGrow");
			System.out.println(1+2+"ReGrow"+1+2);
			System.out.println("ReGrow"+1+2+"Tech");
			System.out.println("ReGrow"+(1+2)+"Tech");
			System.out.println(1+2+"ReGrow"+1+2+"Tech");
			System.out.println(1+2+"ReGrow"+1+2+"Tech"+(2+5));
			
			int x = 3;
			int z = ++x + ++x + x++ + ++x + x++;
			System.out.println("The value of x is: "+x);
			System.out.println("The value of z is: "+z);
			
			int a = 3;
			a = ++a + ++a + a++ + ++a + a++;
			System.out.println("The value of a is: "+a);
			
			
			System.out.println('a'+"ReGrow"+1+7+3);
			System.out.println('a'+'b'+"ReGrow"+1+7+3);
			System.out.println('a'+'b'+"Regrow"+1+7+(3+1));
			System.out.println('a'+1+"ReGrow"+1+7+3);
			System.out.println('a'+'b'+"ReGrow"+1+7+3+'A');
			System.out.println('a'+"ReGrow"+1+7+(3+'a'));
			
		}
		
	}

}
