//23/11/22

class Base1
{
	int x=10;
	public Base1() //Default Const
	{
		System.out.println("Base Class Default Const");
	}
	
	
	public Base1(int n) //Parametric Const
	{
		System.out.println("Parametric Const");
	}
	
	
	public void show()
	{
		System.out.println("Show method from Base Class");
	}
}

class Derived1 extends Base1
{
	int x=20;
	public Derived1()
	{
		super(100);
		System.out.println("Derived Class Default Const");
	}
	
	
	public void show()
	{
		super.show();
		System.out.println("Derived class show method");
		System.out.println("Value of base class x var is: "+super.x);
		System.out.println("Value of Derived Class y var is: "+x);
	}
}
public class SuperKeyWord {

	public static void main(String[] args) {
		System.out.println("In main");
		Derived1 dobj=new Derived1();
		dobj.show();
		System.out.println("Thank You");
	}
}