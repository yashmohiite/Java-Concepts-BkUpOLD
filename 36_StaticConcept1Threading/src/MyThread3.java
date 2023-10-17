//B
//2nd Way to use Thread, to overcome Multiple Inheritance Drawback of Java
public class MyThread3 extends Object implements Runnable{
	private String arr[] = null;
	private int sum = 0;
	
	public MyThread3(String args[])
	{
		this.arr=args;
		new Thread(this).start(); //this means object of MyThread3
	}
	public void run()
	{
		display();
	}
	public void display()
	{
		for(int i=arr.length-1 ; i>=0 ; i--)
		{
			System.out.println(arr[i]);
			sum = sum + Integer.parseInt(arr[i]);
		}
		System.out.println("Sum of all Nos is "+sum);
	}
}
