package sundayfunday;

public class ReverseArray {
	
	public static void main(String args[])
	{
		int arr[]= {12,23,54,56,23};
		for (int i=0; i<arr.length/2 ; i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		for(int each: arr)
		{
			System.out.println(each);
		}
	}

}
