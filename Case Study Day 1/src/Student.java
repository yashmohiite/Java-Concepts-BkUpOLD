//22/11/22
public class Student {
	
	private int studId;
	private String studName;
	private String dob;
	public Student(int studId, String studName, String dob) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.dob = dob;
	}
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
}
