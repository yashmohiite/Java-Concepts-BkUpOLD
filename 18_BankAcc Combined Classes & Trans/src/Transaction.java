//22/11/22
public class Transaction {
	public void withdrawal(Account copyobj, double amt)
	{
		double currbal=copyobj.getAccBal();
		double rembal=currbal-amt;
		copyobj.setAccBal(rembal);
		
		System.out.println("Withdrawal Transaction Completed");
	}
	
	public void deposit(Account copyobj, double amt)
	{
		double currbal=copyobj.getAccBal();
		double rembal=currbal+amt;
		copyobj.setAccBal(rembal);
		System.out.println("Deposit Transaction Completed");
	}
}
