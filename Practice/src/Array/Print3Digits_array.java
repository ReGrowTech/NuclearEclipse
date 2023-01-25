package Array;

public class Print3Digits_array {
	public static void main(String args[])
	{
		int arr[]= {10,52,569,254,56,100,999,5789};
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>99 && arr[i]<1000)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
