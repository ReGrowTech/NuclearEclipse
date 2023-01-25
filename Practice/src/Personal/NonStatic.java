package Personal;

public class NonStatic {
	
	public int SumDigit(int x)
	{
		int sum=0;
		while(x>0)
		{
			int ld=x%10;
			x=x/10;
			x++;
			sum=sum+ld;
		}
		return(sum);
	}

}
