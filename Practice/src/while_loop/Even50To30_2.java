package while_loop;

public class Even50To30_2 { 

	public static void main(String[] args) {

		int sn=50;
		int ln=30;
		
		do
		{
			if(sn%2==0)
			{
				System.out.println(sn);
			}
			sn--;
		}
		while(ln<=sn);
	}
}
