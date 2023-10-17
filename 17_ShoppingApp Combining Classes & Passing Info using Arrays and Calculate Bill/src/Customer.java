//21/11/22
public class Customer {
	
	private int custId;
	private String custName;
	private double custMob;
	
	private Address addr;
	private Product prod[];
	
	public Customer(int custId, String custName, double custMob, Address addr, Product[] prod) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custMob = custMob;
		this.addr = addr;
		this.prod = prod;
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
	public double getCustMob() {
		return custMob;
	}
	public void setCustMob(double custMob) {
		this.custMob = custMob;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Product[] getProd() {
		return prod;
	}
	public void setProd(Product[] prod) {
		this.prod = prod;
	}
}