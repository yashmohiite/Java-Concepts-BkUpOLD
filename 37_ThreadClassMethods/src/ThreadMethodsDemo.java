
public class ThreadMethodsDemo extends Thread{
	String str;

	public ThreadMethodsDemo(String str) {
		this.str = str;
	}
	
	public void run()
	{
		for(int i=1 ; i<=5 ; i++)
		{
			System.out.println("Running...."+str+"\t"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
