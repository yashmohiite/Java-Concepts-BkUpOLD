//18/11/22
public class Customer {
	private int custId;
	private String custName;
	private String mobNo;
	private Product prod; //1 mobile 20000 2
	private Address addr; //Pune MH 411005
	public Customer(int custId, String custName, String mobNo, Product prod, Address addr) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.mobNo = mobNo;
		this.prod = prod;
		this.addr = addr;
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
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
}