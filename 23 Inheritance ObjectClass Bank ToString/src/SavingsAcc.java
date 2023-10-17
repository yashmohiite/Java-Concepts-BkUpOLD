//2/12/22
public class SavingsAcc extends Account{
	private float intRate;

	public SavingsAcc(int accNo, String accType, double accBal, float intRate) {
		super(accNo, accType, accBal);
		this.intRate = intRate;
	}

	public float getIntRate() {
		return intRate;
	}

	public void setIntRate(float intRate) {
		this.intRate = intRate;
	}

	@Override
	public String toString() {
		return getAccNo()+"\t"+getAccType()+"\t"+getAccBal()+"\t"+getIntRate();
	}
	
}
