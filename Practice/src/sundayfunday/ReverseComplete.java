package sundayfunday;

public class ReverseComplete {

	public static void main(String args[])
	{
		String s="I LOVE India";
		s=s.replaceAll("\\s+", " ");
		String ab="";
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			ab=ch+ab;
		}
		System.out.println(ab);
	}
}
