package sundayfunday;

public class Title {
	public static void main(String args[])
	{
		String s="ADIL Afridi Regrow Tech";
		String word[]=s.split(" ");
		System.out.println(s);
		String ans="";
		for(int i=0; i<word.length-1;i++)
		{
			char ch=word[i].charAt(0);
			ans=ans+ch+".";
		}
		ans=ans+word[word.length-1];
		System.out.println(ans);
	}

}
