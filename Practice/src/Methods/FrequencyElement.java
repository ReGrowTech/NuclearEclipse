package Methods;

public class FrequencyElement {

	public static void main(String[] args) {

		int a[]= {11,11,22,22,11,22,33};
		for (int i=0; i<a.length; i++)
		{
			int ctr=FrequencyElement.Frequency(a,i);
			if(ctr!=-1)
			{
				System.out.println(a[i]+"="+ctr);
			}
		}
}


public static int Frequency(int a[],int i)
{
	int cnt=1;
	if(a[i]!=Integer.MAX_VALUE)
	{
		for(int j=i+1;j<a.length; j++)
		{
			if(a[i]==a[j])
			{
				a[j]=Integer.MAX_VALUE;
				cnt++;
			}
		}
	
		return(cnt);
	}
	else
	{
	return (-1);
	}
}
}

