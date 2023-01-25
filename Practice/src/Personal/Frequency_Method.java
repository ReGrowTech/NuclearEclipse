package Personal;

public class Frequency_Method {
	

	public static void main(String args[])
	{
	String a[]={"aaa","bbb","aaa","bbb","ccc"};
	for (int i=0; i<a.length; i++)
	{
	int f=freq(a,i);
	if(f!=0)
	System.out.println(a[i]+"="+f);
	}
	}






	public static int freq(String a[],int i)
	{
	int cnt=1;
	if(a[i]!="Adil")
	{
	for(int j=i+1;j<a.length;j++)
	{
	if(a[i]==a[j])
	{
	a[j]="Adil";
	cnt++;
	}
	}
	return (cnt);
	}
	else {
		return (0);
	}
}
}