//A
public class MyThread2Main {

	public static void main(String[] args) {
		MyThread2 m = new MyThread2(args);
		//m.display(); Without using Thread normal Calling
		m.start(); //Using Thread
	}

}