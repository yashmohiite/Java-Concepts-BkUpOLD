import java.util.Scanner;
public class EmployeeInfo {

	public Employee[] create() {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Employee do you want");
		int n = sc.nextInt();
		Employee emparr[]=new Employee[n];
		
		for (int i=0 ; i<emparr.length; i++)
		{
			System.out.println("Enter Employee ID, Name, Salary");
			int empId=sc.nextInt();
			String empName=sc.next();
			double empSal=sc.nextDouble();
			Employee eobj=new Employee(empId, empName, empSal);
			emparr[i]=eobj;
		}
		
		return emparr;
		
		}
	
	public void display(Employee eobj[])
	{
		for (int i=0 ; i<eobj.length;i++)
		{
			System.out.println(eobj[i].getEmpId()+"\t"+eobj[i].getEmpName()+"\t"+eobj[i].getEmpSal());
		}
	}
}
