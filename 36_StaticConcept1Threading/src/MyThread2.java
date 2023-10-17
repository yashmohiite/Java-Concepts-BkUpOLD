//A
public class MyThread2 extends Thread{
	
	private String arr[] = null;
	private int sum = 0;
	
	public MyThread2(String args[])
	{
		this.arr=args;
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
