package sundayfunday;

public class Reverse_Element {

	public static void main(String args[])
	{
		int arr[]= {12,23,45,76,85};
		int cnt=-1;
		for(int i=0;i<arr.length; i++)
		{
			int rev=0;
			cnt++;
			while(arr[i]>0)
			{
				int ld=arr[i]%10;
				arr[i]=arr[i]/10;
				rev=rev*10+ld;
			}
			arr[cnt]=rev;
		}
		for(int each:arr)
		{
			System.out.println(each);
		}
	}
}
