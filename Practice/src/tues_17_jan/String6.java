package tues_17_jan;

public class String6 {

	public static void main(String args[])
	{
		String a[]= {"pop","tot","lol","Art"};
	
		
		for(String word : a)
		{

			if(word.charAt(0)==word.charAt(word.length()-1))
			{
			
				System.out.println(word);
			}
			
		}
		
		System.out.println(" \n");
		for(String each:a)
		{
			System.out.println(each);
		}
	}
}
