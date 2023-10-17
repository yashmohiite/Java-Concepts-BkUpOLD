//23/12/22
//Add Hash
import java.util.Objects;
import java.util.*; 

public class Employee4 {
	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, empSal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee4 other = (Employee4) obj;
		return empId == other.empId && Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(empSal) == Double.doubleToLongBits(other.empSal);
	}
	private int empId;
	private String empName;
	private double empSal;
	public Employee4(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
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
