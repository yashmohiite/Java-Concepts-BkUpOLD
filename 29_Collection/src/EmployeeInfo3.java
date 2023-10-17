//22/12/22
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class EmployeeInfo3 {
	Scanner sc=new Scanner(System.in);
	
	public Set<Employee3> createEmployee()
	{
		String str=null;
		Set<Employee3> lst=new TreeSet<Employee3>();
		do
		{
			System.out.println("Enter Employee ID, Name, & Salary: ");
			Employee3 e = new Employee3(sc.nextInt(), sc.next(), sc.nextDouble());
			lst.add(e);
			System.out.println("Do you want to add new Employee? Enter: Yes/No");
			str=sc.next();
		}while(str.equals("yes"));
		return lst;
	}
	
	public Employee3 searchEmployee(Set<Employee3> lst, int empId)
	{
		Employee3 etemp=null;
		for(Employee3 e:lst)
		{
			if(e.getEmpId2()==empId)
			{
				etemp=e;
				break;
			}
		}
		return etemp;
	}
	
	public boolean deleteEmployee(Set<Employee3> lst, Employee3 etemp2, int empId2)
	{
		boolean b=false;
		for(Employee3 e:lst)
		{
			if(e.getEmpId2()==empId2)
			{
				b=lst.remove(etemp2);
			}
		}
		return b;
	}
	
	public void displayEmployee(Set<Employee3> lst)
	{
		System.out.println("ID\tName\tSalary");
		for(Employee3 e: lst)
		{
			System.out.println(e.getEmpId2()+"\t"+e.getEmpName2()+"\t"+e.getEmpSal2());
		}
	}
}
