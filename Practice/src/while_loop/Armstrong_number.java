package while_loop;

public class Armstrong_number {

	public static void main(String[] args) {

		int n = 153;
		int n1=n;
		int n2=n;
		int sum=0;
		int cnt=0;
		while(n>0)
		{
			n=n/10;
			cnt++;
		}
		while(n1>0)
		{
			int ld=n1%10;
			n1=n1/10;
			
			int ld_pow=(int)Math.pow(ld,cnt);
			sum=sum+ld_pow;
		}
		if(n2 == sum)
		{
			System.out.println("It's Armstrong Number.");
		}
		else
		{
			System.out.println("Not a Armtring number.");
		}
		}

}
