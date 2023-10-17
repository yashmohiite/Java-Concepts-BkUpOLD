//C1
public class Calculation extends Thread{
	private int no1;
	private int no2;
	public Calculation(int no1, int no2) {
		//super();
		this.no1 = no1;
		this.no2 = no2;
	}
	
	public void run()
	{
		addData();
	}
	
	public void addData()
	{
		int sum = no1 + no2;
		System.out.println("Addition is "+sum);
	}
}
