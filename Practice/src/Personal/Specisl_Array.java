package Personal;

public class Specisl_Array {
	public static void main(String args[])
	{
	int arr[]={1,3,145,12,24586};
	for(int i=0; i<arr.length; i++)
	{
	int a=arr[i];
	int sum=0;
	while(a>0)
	{
	int ld=a%10;
	a=a/10;
	int fact=1;
	for(int s=1;s<=ld;s++)
	{
	fact=fact*s;
	}
	sum=sum+fact;
	}
	if(arr[i]==sum)
	{
	System.out.println("Special number: "+arr[i]);
	}
	}
	}
	}
