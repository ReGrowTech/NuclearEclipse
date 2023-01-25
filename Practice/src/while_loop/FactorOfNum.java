package while_loop;

public class FactorOfNum {

	public static void main(String args[])
	{
		int n=155;
		int n1=n;
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
			int ld_pow =(int)Math.pow(ld,count);
			System.out.println(ld_pow);
		}
		
	}
}
