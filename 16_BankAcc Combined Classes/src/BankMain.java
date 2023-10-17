//21/11/22
public class BankMain {

	public static void main(String[] args) {
		BankInfo binfo=new BankInfo();
		Customer cust=binfo.createAcc();
		binfo.displayAccount(cust);
	}
}
