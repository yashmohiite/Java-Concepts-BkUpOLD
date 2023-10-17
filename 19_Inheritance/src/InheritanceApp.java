//23/11/22
class Base //Super Class / Parent Class / Base Class
{
	public Base()
	{
		System.out.println("Base Class Default Const");
	}
	public void showBase()
	{
		System.out.println("Show method from Base Class");
	}
}

class Derived extends Base //SubClass / Child Class / Derived Class
{
	public Derived()
	{
		System.out.println("Derived class Default Const");
	}
	public void showDerived()
	{
		showBase();
		System.out.println("Derived class Show Method");
	}
}
public class InheritanceApp {

	public static void main(String[] args) {
		System.out.println("In Main");
		Derived dobj=new Derived();
		dobj.showDerived();
		System.out.println("Thankk You");
	}

}
