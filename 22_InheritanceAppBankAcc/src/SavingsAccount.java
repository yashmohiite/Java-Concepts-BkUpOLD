//24/11/22
public class SavingsAccount extends Account {
	
	private float intRate;

	public SavingsAccount(int accNo, String accType, double accBal, float intRate) {
		super(accNo, accType, accBal);
		this.intRate = intRate;
	}

	public float getIntRate() {
		return intRate;
	}

	public void setIntRate(float intRate) {
		this.intRate = intRate;
	}
	
}
