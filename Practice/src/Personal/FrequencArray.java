package Personal;

public class FrequencArray {
		public static void main(String args[])
	{
	String a[]={"aba","aba","bca","bca","aba","caa"};
	for(int i=0; i<a.length; i++)
	{
	int cnt=1;
	if(a[i]!="Adil")
	{
	for(int j=i+1; j<a.length; j++)
	{
	if(a[i]==a[j])
	{
	cnt++;
	a[j]="Adil";
	}
	}
	System.out.println(a[i]+"="+cnt);
	}
	}
	}
	}

