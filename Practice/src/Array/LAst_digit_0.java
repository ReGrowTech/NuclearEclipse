package Array;

public class LAst_digit_0 {
	public static void main(String args[])
	{
		int arr[]= {10,25,120,15};
		System.out.println("These number are Have last digit is xoxo:");
		for(int i=0; i<arr.length; i++)
		{
			int ld=arr[i]%10;
			if(ld==0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
