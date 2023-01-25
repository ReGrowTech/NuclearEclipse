package Array;

public class Armstrong_array {
	public static void main(String args[])
	{
		int arr[]= {153,1,56,35632};
		for(int i=0; i<arr.length; i++)
		{
			int sum=0;
			int count=0;
			int i1=arr[i];
			int i2=arr[i];
			while(i2>0)
			{
				i2=i2/10;
				count++;
			}
			while(i1>0)
			{
				int ld=i1%10;
				i1=i1/10;
				
				int ld_pow=(int)Math.pow(ld, count);
				sum=sum+ld_pow;
			}
			if(arr[i]==sum)
			{
				System.out.println("Armstrong number: "+arr[i]);
			}
		}
	}

}
