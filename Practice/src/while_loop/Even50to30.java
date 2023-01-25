package while_loop;

public class Even50to30 {

	public static void main(String[] args) {

		int sn = 50;
		int ln = 30;
		
		while(sn>=ln)
		{
			if(sn%2==0)
			{
				System.out.println(sn);
			}
			sn--;
		}
	}

}
