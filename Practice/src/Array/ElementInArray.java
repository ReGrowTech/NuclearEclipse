package Array;

public class ElementInArray {
	public static void main(String args[])
	{
		int arr[]= {10,58,45,56,281};
		int n=281;
		boolean flag=false;
		
		for(int i=0; i< arr.length ;i++)
		{
			if(arr[i] == n)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Given Element is Founded.");
		}
		else
		{
			System.out.println("Given Element not in Founded.");
		}
	}

}
