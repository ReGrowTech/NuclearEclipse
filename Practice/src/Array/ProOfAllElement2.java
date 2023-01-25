package Array;

public class ProOfAllElement2 {

	public static void main(String[] args) {

		int arr[]= {12,45,25,48,57};
		int pro=1;
		for(int i=0; i<arr.length; i++)
		{
			pro=pro*arr[i];
		}
		System.out.println(pro);
		
	}

}
