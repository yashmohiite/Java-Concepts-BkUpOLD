//16/11/22
public class ConceptsMain {

	public static void main(String[] args) {
		
		/*
		Concepts c=new Concepts();
		System.out.println("Employee ID : "+c.getEmpId());
		System.out.println("Employee Name : "+c.getEmpName());
		System.out.println("Employee Salary : "+c.getEmpSal());
		*/
		
		
		Concepts cobj2 = new Concepts(202, "Ganesh", 3000);
		System.out.println("Employee ID : "+cobj2.getEmpId());
		System.out.println("Employee Name : "+cobj2.getEmpName());
		System.out.println("Employee Salary : "+cobj2.getEmpSal());
	}
}