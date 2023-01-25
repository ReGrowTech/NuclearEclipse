package ReGrow;

public class Armstrong1to1000 {
	
	public static void main(String args[])
	{
		for(int i=1;i<=1000;i++)
		{
			int n=i;
			int n1=i;
			int n2=i;
			int sum=0;
			int count=0;
			
			while(n>0)
			{
				n=n/10;
				count++;
			}
			
			while(n1>0)
			{
				int ld=n1%10;
				n1=n1/10;
				
				int pow_ld=(int)Math.pow(ld, count);
				sum=sum+pow_ld;
			}
			if(sum==n2)
			{
				System.out.println(n2);
			}

		}
	}

}
