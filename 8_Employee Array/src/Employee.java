
public class Employee {

	private int empId;
	private String empName;
	private double empSal;
	/**
	 * @param empId
	 * @param empName
	 * @param empSal
	 */
	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empSal
	 */
	public double getEmpSal() {
		return empSal;
	}
	/**
	 * @param empSal the empSal to set
	 */
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	
}
