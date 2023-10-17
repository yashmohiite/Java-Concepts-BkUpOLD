
public class User extends Thread{
	String str;
	Mobile m;
	public User(Mobile m, String str)
	{
		this.m=m;
		this.str=str;
	}
	public void run()
	{
		//2nd Way: synchronized block
		synchronized(m) //All methods of this class becomes synchronized
		{
			m.calling(str);
			m.sms();
		}
	}
}
