package sundayfunday;

public class SahidBhai3 {

	public static void main(String[] args) {

		String st="adil";
		String res=rev(st);
		if(st.equals(res)==true)
		{
			System.out.println("Palingdrom");
		}
		else
		{
			System.out.println("Not pallingdrom");
		}
		
	}
	public static String rev(String st)
	{
		String a="";
		for(int i=0; i<st.length();i++)
		{
			char ch=st.charAt(i);
			a=ch+a;
		}
		return a;
	}

}
