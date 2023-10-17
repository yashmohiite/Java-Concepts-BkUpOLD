//20/12/22
import java.util.*;
public class EmployeeCollectionMain2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=null;
		
		EmployeeInfo2 einfo=new EmployeeInfo2();
		int ch=0;
		
		List<Employee2> lst=null;
		do
		{
			System.out.println("1-Create\n2-Display\n3-Search\n4-Delete");
			System.out.println("Enter your Choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				lst=einfo.createEmployee();
				break;
			case 2:
				einfo.displayEmployee(lst);
				break;
			case 3:
				System.out.println("Enter Employee ID to Search: ");
				int empId=sc.nextInt();
				Employee2 etemp=einfo.searchEmployee(lst, empId);
				if(etemp!=null)
				{
					System.out.println("Employee Found");
					System.out.println(etemp.getEmpId2()+"\t"+etemp.getEmpName2()+"\t"+etemp.getEmpSal2());
				}
				break;
			case 4:
				System.out.println("Enter Employee ID to be Deleted: ");
				int empIdDel=sc.nextInt();
				Employee2 etemp2=einfo.searchEmployee(lst, empIdDel);
				if(etemp2!=null)
				{
					if(einfo.deleteEmployee(lst, etemp2, empIdDel))
					{
						System.out.println("Employee Data Deleted");
					}
					else
					{
						System.out.println("Employee Data NOT Deleted");
					}
				}
				else
				{
					System.out.println("Invalid Employee ID");
				}
				break;
			}
			System.out.println("Do you want to continue? Y/N?");
			str=sc.next();
		}while(str.equalsIgnoreCase("Y")||str.equalsIgnoreCase("YES"));
		//System.out.println("---------------THANK YOU--------------");
		
		System.out.println("---------------------TERMINATED-----------------------");
	}
}