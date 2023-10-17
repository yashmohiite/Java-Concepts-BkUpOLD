//6/1/23
public class Employee1Main {

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1(1,"ABC",123456.123456789);
		
		System.out.println("Employee ID: "+emp1.getEmpId());
		System.out.println("Employee Name: "+emp1.getEmpName());
		System.out.println("Employee Salary: "+emp1.getEmpSal());
	}

}
