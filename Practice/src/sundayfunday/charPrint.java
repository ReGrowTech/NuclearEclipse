package sundayfunday;

public class charPrint {

	public static void main(String[] args) {

		String s="ADIL ADRIDI REgrow";
		String a1[]=s.split(" ");
		String str="";
		for(String each:a1)
		{
			str=each+" "+str;
		}
		System.out.println(str+"\"Adul\""+"\"Afrdid\"");
	}

}
