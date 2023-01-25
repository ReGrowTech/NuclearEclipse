package Array;

public class Sorting_array {

	public static void main(String[] args) {

		int arr[]= {10,25,14,3,6,3,1};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=(i+1); j<arr.length; j++)
			{
				int temp=0;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int each:arr)
		{
			System.out.println(each);
		}
		System.out.println("2nd Largest no:"+arr[arr.length-2]);
		System.out.println("4th smallest no:"+arr[3]);
	}

}
