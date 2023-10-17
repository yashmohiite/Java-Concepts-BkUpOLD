//24/11/22
public class InheritanceAppMain {

	public static void main(String[] args) {
		Manager man=new Manager(1, "ABC", 10000.123, 10000);
		display(man, "Manager");
		/*System.out.println("Emp ID: "+man.getEmpId());
		System.out.println("Emp Name: "+man.getEmpId());
		System.out.println("Emp Sal: "+man.getEmpSal());
		System.out.println("Bonus: "+man.getBonus());*/
		
		System.out.println("--------------------------------------");
		
		Developer dev=new Developer(2, "Def", 20000.321, 15);
		display(dev, "Developer");
		/*System.out.println("Dev ID: "+dev.getEmpId());
		System.out.println("Dev Name: "+dev.getEmpName());
		System.out.println("Dev Sal: "+dev.getEmpSal());
		System.out.println("Dev No of Hrs: "+dev.getNoofhrs());*/
	}
	
	public static void display(Employee eobj, String str)
	{
		System.out.println(str+"ID: "+eobj.getEmpId());
		System.out.println(str+"Name: "+eobj.getEmpName());
		System.out.println(str+"Salary: "+eobj.getEmpSal());
		if(eobj instanceof Manager)
		{
			Manager man=(Manager)eobj; //DownCasting
			System.out.println(str+"Bonus: "+man.getBonus());
		}
		else if(eobj instanceof Developer)
		{
			Developer dev=(Developer)eobj; //DownCasting
			System.out.println(str+"No of Hrs: "+dev.getNoofhrs());
		}
	}
}
