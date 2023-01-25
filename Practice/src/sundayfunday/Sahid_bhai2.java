package sundayfunday;

public class Sahid_bhai2 {

	public static void main(String[] args) {

		int arr[]= {10,6,7,9,5,4,3};
		int cnt=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
				cnt++;
			}
		}
		System.out.println(arr.length-cnt+" odd number");
	}

}
