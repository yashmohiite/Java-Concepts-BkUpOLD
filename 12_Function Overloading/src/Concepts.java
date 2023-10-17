//16/11/22
public class Concepts {
	private int empId;
	private String empName;
	private double empSal;
	
	public Concepts()
	{
		System.out.println("This is a Default Constructor");
	}
	
	//Parametric Constructor
	
	public Concepts(int empId, String empName, double empSal)
	{
		this(); //Here we can call another Constructor of Same Class
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
	}

	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
}