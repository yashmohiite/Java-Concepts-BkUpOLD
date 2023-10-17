
public class DemoRunnable implements Runnable{

	private Demo d1;
	
	public DemoRunnable(Demo d1)
	{
		this.d1 = d1;
		new Thread(this).start();
	}
	
	@Override
	public void run() {		
		d1.calculate();
	}

}
