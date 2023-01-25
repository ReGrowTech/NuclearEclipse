package wed_18_jan;

public class SortingArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,6,2,5,4};
		int arr[]=adildesc(a);
		System.out.println(arr[arr.length-3]);
		
	}
	public static int[] adildesc(int a[])
	{
		for(int i=0; i<a.length;i++)
		{
			int temp=0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return (a);
	}
}
