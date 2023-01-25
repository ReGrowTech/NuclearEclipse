package thurs_19_jan;

public class Title {

	public static void main(String[] args) {

		String s="Adil Afridi REgrow tech";
		String word[]=s.split(" ");
		String s1="";
		
		for(int i=0; i<word.length-1;i++)
		{
			s1=s1+word[i].charAt(0)+".";
		}
		s1=s1+word[word.length-1];
		System.out.println(s1);
	}

}
