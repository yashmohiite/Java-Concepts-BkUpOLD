//D //17/11/22
public class Account2 {
	private int accNo;
	private String custName;
	private double accBal;
	
	public Account2(int accNo, String custName, double accBal) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accBal = accBal;
	}

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
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
}
