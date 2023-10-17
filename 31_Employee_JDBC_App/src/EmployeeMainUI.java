//24/01/23
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EmployeeMainUI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		Employee etemp=null;
		EmployeeDaoImpl edao=new EmployeeDaoImpl();
		List<Employee> lst=new ArrayList<Employee>();
		do
		{
			System.out.println("1-Create\n2-Delete\n3-Update\n4-Search\n5-Display");
			System.out.println("Enter your Choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Emp ID, Name, Salary");
				Employee eobj=new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
				lst.add(eobj);
				i=edao.createRecord(lst);
				if(i>0)
				{
					System.out.println("Record Saved");
				}
				else
				{
					System.out.println("Not Save");
				}
				break;
				
			case 2:
				System.out.println("Enter Emp ID to Delete Record");
				int empid=sc.nextInt();
				i=edao.deleteRecord(empid);
				if(i>0)
				{
					System.out.println("Record Deleted");
				}
				break;
				
			case 3:
				System.out.println("Enter EMP ID and Add New Salary to Update in Database:");
				int eid=sc.nextInt();
				double empsal=sc.nextDouble();
				etemp=new Employee();//empid ename esal
				etemp.setEmpId(eid);
				etemp.setEmpSal(empsal);
				lst.add(etemp);
				i=edao.updateRecord(lst);
				if(i>0)
				{
					System.out.println("Record Updated");
				}
				break;
				
			case 4:
				System.out.println("Enter Emp ID to search Record");
				eid=sc.nextInt();
				lst=edao.searchRecord(eid);
				if(lst!=null)
				{
					etemp=lst.get(0);
					System.out.println(etemp.getEmpId()+"\t"+etemp.getEmpName()+"\t"+etemp.getEmpSal());
				}
				else
				{
					System.out.println("Invalid Emp ID");
				}
				break;
				
			case 5:
				//Display All Records
				break;
			}
			System.out.println("Do you want to continue, Y/N");
		}while(sc.next().equalsIgnoreCase("y"));
		
		System.out.println("--------------------------------THANK YOU------------------------------------");

	}

}
