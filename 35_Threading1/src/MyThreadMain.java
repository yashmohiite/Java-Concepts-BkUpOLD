//B2
public class MyThreadMain {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		//Thread is created here
		t1.start(); //Runnable
		
		System.out.println("Thank You");
	}

}
