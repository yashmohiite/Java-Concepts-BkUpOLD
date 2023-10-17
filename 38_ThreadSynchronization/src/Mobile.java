
public class Mobile {
	//public synchronized void calling(String str) //1st Way
	public void calling(String str)
	{
		System.out.println("Start Call.........."+str);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End Call........."+str);
	}
	
	public void sms()
	{
		System.out.println("Send SMS....");
	}
}
