//23/12/22
//Add Hash
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class EmployeeInfo4 {
	Scanner sc=new Scanner(System.in);
	
	public Set<Employee4> createEmployee()
	{
		String str=null;
		Set<Employee4> lst=new HashSet<Employee4>();
		do
		{
			System.out.println("Enter Employee ID, Name, & Salary: ");
			Employee4 e = new Employee4(sc.nextInt(), sc.next(), sc.nextDouble());
			lst.add(e);
			System.out.println("Do you want to add new Employee? Enter: Yes/No");
			str=sc.next();
		}while(str.equals("yes"));
		return lst;
	}
	
	public Employee4 searchEmployee(Set<Employee4> lst, int empId)
	{
		Employee4 etemp=null;
		for(Employee4 e:lst)
		{
			if(e.getEmpId()==empId)
			{
				etemp=e;
				break;
			}
		}
		return etemp;
	}
	
	public boolean deleteEmployee(Set<Employee4> lst, Employee4 etemp2, int empId2)
	{
		boolean b=false;
		for(Employee4 e:lst)
		{
			if(e.getEmpId()==empId2)
			{
				b=lst.remove(etemp2);
			}
		}
		return b;
	}
	
	public void displayEmployee(Set<Employee4> lst)
	{
		System.out.println("ID\tName\tSalary");
		for(Employee4 e: lst)
		{
			System.out.println(e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSal());
		}
	}
}
