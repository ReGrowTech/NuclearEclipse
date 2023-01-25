package Array;

public class Reverse_array {
	public static void main(String args[])
	{
		int arr[]= {10,5,54,16};
		for(int i=0; i<arr.length/2; i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		for(int each:arr)
		{
			System.out.println(each);
		}
		
	}

}
