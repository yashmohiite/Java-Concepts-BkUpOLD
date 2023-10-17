//6/1/23
import java.util.*;
public class Customer {
	private int custId;
	private String custName;
	private String custMob;
	private List<Product> lobj;
	private Address addr;
	public Customer(int custId, String custName, String custMob, List<Product> lobj, Address addr) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custMob = custMob;
		this.lobj = lobj;
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
	public String getCustMob() {
		return custMob;
	}
	public void setCustMob(String custMob) {
		this.custMob = custMob;
	}
	public List<Product> getLobj() {
		return lobj;
	}
	public void setLobj(List<Product> lobj) {
		this.lobj = lobj;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
}
