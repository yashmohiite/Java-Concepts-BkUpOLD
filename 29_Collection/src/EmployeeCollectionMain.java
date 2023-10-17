//19/12/22
import java.util.*;
public class EmployeeCollectionMain {

	public static void main(String[] args) {
		
		String str;
		Scanner sc=new Scanner(System.in);
		
		List<Employee> lst=new LinkedList<Employee>();	//Note Syntax
		
		do
		{
			System.out.println("Enter employee ID, Name, Salary: ");
			Employee e=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
			
			lst.add(e);
			
			System.out.println("Do you want to add more Employee, Press Y/N");
			str=sc.next();
			
		}while(str.equals("yes")||str.equals("y")||str.equals("Y")||str.equals("Yes"));
		
		display(lst);
		System.out.println("--------------------------------Thank You-------------------------------------");
	}
	public static void display(List<Employee> lst)
	{
		for(Employee e:lst)	//Note Syntax
		{
			System.out.println(e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSal());
		}
	}
} 