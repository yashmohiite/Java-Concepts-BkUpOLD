//24/11/22
public class CurrentAccount extends Account {

	private String compName;

	public CurrentAccount(int accNo, String accType, double accBal, String compName) {
		super(accNo, accType, accBal);
		this.compName = compName;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}
	
}
