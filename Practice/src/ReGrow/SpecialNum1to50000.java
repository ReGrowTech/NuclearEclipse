package ReGrow;

public class SpecialNum1to50000 {

	public static void main(String args[]) {
		for(int n=1; n<=50000; n++)
		{
			int n1=n;
			int n2=n;
			int sum=0;
			while(n2>0)
			{
				int ld=n2%10;
				n2=n2/10;
				int fact=1;
				for(int i=1;i<=ld;i++)
				{
					fact=fact*i;
				}
				sum=sum+fact;
			}
			if(sum==n1)
			{
				System.out.println(n1);
			}
		}
	}
}
