package Personal;

public class Array_Large_small {
	public static void main(String args[])
	{
		int a[]= {10,40000,96,888,9};
		int max=a[0];
		int min=a[0];
		for(int i=1; i<a.length; i++)
		{
				if(a[i]>max)
				{
					max=a[i];
				}
				if(a[i]< min)
				{
					min=a[i];
				}
		}
		System.out.println("Max"+max);
		System.out.println("Min"+min);
	}

}
