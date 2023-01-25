package ReGrow;

public class Harshad_number {

	public static void main(String[] args) {
		int n=24;
		int n1=n;
		int sum=0;
		while(n>0)
		{
			int ld=n%10;
			n=n/10;
			sum=sum+ld;
		}
		//System.out.println(sum);
		if(n1%sum==0)
		{
			System.out.println("Harshad Number");
		}
		else
		{
			System.out.println("Not a Harshad Number");
		}
	}

}
