package while_loop;

public class Factorial {

	public static void main(String[] args) {
		int n=145;
		int sum=0;
		int n1=n;
		
		while(n>0)
		{
			int ld = n%10;
			n=n/10;
			
			int fact=1;
			int i=1;
			while(i<=ld)
			{
				fact=fact*i;
				i++;
			}
			sum=sum+fact;
		}
		System.out.println("Sum of factorial is:"+sum);
		if(n1==sum)
		{
			System.out.println("Special Number!");
		}
		else
		{
			System.out.println("Not a Krishna Murti number!");
		}
	}

}
