package Methods;

public class Array_ele_rev {

	public static void main(String args[])
	{
		int a[]= {12,54,68,48,78};
		int count=-1;
		for(int i=0; i<a.length; i++)
		{
			count++;
			int r=Reverse_number.rev(a[i]);
			a[count]=r;
		}
		System.out.println("Your Reverse Number is: \n");
		for(int each:a)
		{
			System.out.println(each);
		}
	}
}
