//24/11/22
public class Developer extends Employee {
	private int noofhrs;

	public Developer(int empId, String empName, double empSal, int noofhrs) {
		super(empId, empName, empSal);
		this.noofhrs = noofhrs;
	}

	public int getNoofhrs() {
		return noofhrs;
	}

	public void setNoofhrs(int noofhrs) {
		this.noofhrs = noofhrs;
	}
}
