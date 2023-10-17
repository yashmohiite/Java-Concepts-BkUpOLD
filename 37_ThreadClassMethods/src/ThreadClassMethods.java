/*
 * java.lang.*
 * 	 Thread Class
 * 		sleep()
 * 		setName()
 * 		getName()
 * 		setPriority()
 * 		getPriority()
 * 		isAlive()
 * 		join()
 * */
public class ThreadClassMethods {

	public static void main(String[] args) {
		
		ThreadMethodsDemo t1 = new ThreadMethodsDemo("Java");
		ThreadMethodsDemo t2 = new ThreadMethodsDemo("Oracle");
		
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println(t1.isAlive()); //When you create any Thread by default isAlive is false by default
		System.out.println(t1.getPriority()); //Thread will get Priority from Parent(Here 'Main') Default 5
		System.out.println(t1.getName());
		
		//t1.setPriority(Thread.NORM_PRIORITY+2);//7
		//t2.setPriority(Thread.MAX_PRIORITY);//10
		
		t1.start();
		t2.start();
		
		for(int i=1 ; i<=5 ; i++)
		{
			System.out.println("Main "+i);
			try {
				//Thread.sleep(3000);
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//Every time different O/P when both Threads are Ready. So use setPriority to decide which to Run First, But No Guarantee,
		//it's just a Request to JVM. But Higher Priority Thread may get More CPU Time.
		/*
		System.out.println(t1.isAlive());
		t1.setName("HelloThread");
		t2.setName("HelloThread2");
		System.out.println(t2.isAlive());
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		*/
	}

}
