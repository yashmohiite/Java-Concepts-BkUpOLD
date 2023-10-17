class Demo extends Thread
{
	Demo()
	{
		
	}
}
public class ThreadApp {

	public static void main(String[] args) {
		Demo t1 = new Demo();
		t1.setDaemon(true);//Now this thread is Daemon
		if(t1.isDaemon())
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
/*
Revision:

Thread.MAX_PRIORITY  10
Thread.MIN_PRIORITY  1
Thread.NORM_PRIORITY 5

sleep()
join()
yield()

synchronization()

InterThread
*/