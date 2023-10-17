//2/12/22
//Modified 7/12/22
public class Customer {
	private int custId;
	private String custName;
	private String custMob;
	private Account aobj;
	public Customer(int custId, String custName, String custMob, Account aobj) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custMob = custMob;
		this.aobj = aobj;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustMob() {
		return custMob;
	}
	public void setCustMob(String custMob) {
		this.custMob = custMob;
	}
	public Account getAobj() {
		return aobj;
	}
	public void setAobj(Account aobj) {
		this.aobj = aobj;
	}
	
	@Override
	public String toString() 
	{
		return custId +" "+ custName+" "+custMob+" "+aobj;
	}
}