package Array;

public class Pallingdrom_array {

	public static void main(String[] args) {

		int arr[]= {12,11,45,57,141};
		for(int i=0; i<arr.length; i++)
		{
			int rev=0;
			int a=arr[i];
			while(a>0)
			{
				int ld=a%10;
				a=a/10;
				rev=(rev*10)+ld;
			}
			if(arr[i]==rev)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
