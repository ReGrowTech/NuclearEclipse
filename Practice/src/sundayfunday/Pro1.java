package sundayfunday;

public class Pro1 
{
	public static void main(String args[])
	{
		String s="Regrow Tech India";
		String a[]=s.split(" ");
		System.out.println(s);
		for(String each:a)
		{
			String str=""+each.charAt(0)+each.charAt(each.length()-1);
			//char ch=each.charAt(0);
			//char c=each.charAt(each.length()-1);
			//str=str+ch+c;
			System.out.println(str);
		}
		
	}

}
