//2/12/22
public class CurrentAcc extends Account {
	private String compName;

	public CurrentAcc(int accNo, String accType, double accBal, String compName) {
		super(accNo, accType, accBal);
		this.compName = compName;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	@Override
	public String toString() {
		return getAccNo()+"\t"+getAccType()+"\t"+getAccBal()+"\t"+getCompName();
	}
}
