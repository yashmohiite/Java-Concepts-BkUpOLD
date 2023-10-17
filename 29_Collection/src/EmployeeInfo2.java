//20/12/22
import java.util.*;
public class EmployeeInfo2 {
	Scanner sc=new Scanner(System.in);
	
	public List<Employee2> createEmployee()
	{
		String str=null;
		List<Employee2> lst=new LinkedList<Employee2>();
		do
		{
			System.out.println("Enter Employee ID, Name, & Salary: ");
			Employee2 e = new Employee2(sc.nextInt(), sc.next(), sc.nextDouble());
			lst.add(e);
			System.out.println("Do you want to add new Employee? Enter: Yes/No");
			str=sc.next();
		}while(str.equalsIgnoreCase("yes")||str.equalsIgnoreCase("y"));
		return lst;
	}
	
	public Employee2 searchEmployee(List<Employee2> lst, int empId)
	{
		Employee2 etemp=null;
		for(Employee2 e:lst)
		{
			if(e.getEmpId2()==empId)
			{
				etemp=e;
				break;
			}
		}
		return etemp;
	}
	
	public boolean deleteEmployee(List<Employee2> lst, Employee2 etemp2, int empId2)
	{
		boolean b=false;
		for(Employee2 e:lst)
		{
			if(e.getEmpId2()==empId2)
			{
				b=lst.remove(etemp2);
			}
		}
		return b;
	}
	
	public void displayEmployee(List<Employee2> lst)
	{
		System.out.println("ID\tName\tSalary");
		for(Employee2 e: lst)
		{
			System.out.println(e.getEmpId2()+"\t"+e.getEmpName2()+"\t"+e.getEmpSal2());
		}
	}
}
