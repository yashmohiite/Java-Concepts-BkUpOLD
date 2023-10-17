//31/01/23
package linkcode.bank.model;

public class Registration {
	private int accNo;
	private String custName;
	private String userName;
	private String password;
	private double accBal;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	public Registration(int accNo, String custName, String userName, String password, double accBal) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.userName = userName;
		this.password = password;
		this.accBal = accBal;
	}
}
