//18/11/22
import static java.lang.System.out;
class Demo
{
	int n1;
	static int n2;
	
	static
	{
		out.println("This is Staic Block");
	}
	
	public Demo()
	{
		out.println("Constructor");
	}
	
	public void show()
	{
		System.out.println("Value of n2 is: "+n2);
	}
	
	public static void display()
	{
		Demo temp = new Demo();
		temp.n1=100; //TO access non static var in static method we need an obj of that class
		System.out.println("Value of n1 is : "+temp.n1);
		System.out.println("Value of n2 is : "+n2);
	}
}

public class DemoStaticMain
{
	public static void test1()
	{
		System.out.println("Hello Test1");
	}
	
	public static void main(String[] args)
	{
		test1();
		Demo.display();
		Demo d1=new Demo();
		Demo d2=new Demo();
		d1.n1=10;
		d1.n2=10;
		d1.show(); //10 10 d2.n1=20;
		d2.n2=20;
		d2.show(); //20 20
		d1.show(); //10 20
	}
}