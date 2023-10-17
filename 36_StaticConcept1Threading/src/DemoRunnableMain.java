//Approach to implement Runnable
public class DemoRunnableMain {

	public static void main(String[] args) {
		
		Demo d1 = new Demo(10, 20);
		DemoRunnable t = new DemoRunnable(d1);
	}

}
