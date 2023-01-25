package thurs_19_jan;

public class Reverse_word_SamePosition {

	public static void main(String[] args) {

		String str="Adil Afridi";
		String word[]=str.split(" ");
		String r="";
		for(String each:word)
		{
		     String s1="";
		     for(int j=0; j<each.length();j++)
		     {
		    	 char ch=each.charAt(j);
		    	 s1=ch+s1;
		     }
		     r=r+s1+" ";			
		}
		System.out.println(r);
	}

}
