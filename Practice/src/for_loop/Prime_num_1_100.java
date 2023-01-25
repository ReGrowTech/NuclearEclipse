package for_loop;

public class Prime_num_1_100 {

	public static void main(String[] args) {
		for(int n=1;n<=100;n++)
		{
			int cnt=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.println(n);
			}
		}

	}

}
