//A
public class Threading1 {

	public static void main(String[] args) 
	{
		for(int i=1 ; i<=5 ; i++)
		{
			System.out.println(i);
			
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}	
	}
}
