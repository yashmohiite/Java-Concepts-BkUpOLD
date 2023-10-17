//24/11/22
public class InheritanceBankMain {

	public static void main(String[] args)
	{
		SavingsAccount sac=new SavingsAccount(11111, "Savings", 100000.1234, 6.32f);
		display(sac, "Savings Acc");
		
		System.out.println("-----------------------------------------");
		
		CurrentAccount cac=new CurrentAccount(22222, "Current", 652488.8412, "Competitive");
		display(cac, "Current Acc");
	}
	
	public static void display(Account aobj, String str)
	{
		System.out.println(str+" No: "+aobj.getAccNo());
		System.out.println(str+" Bal: "+aobj.getAccBal());
		
		if(aobj instanceof SavingsAccount)
		{
			SavingsAccount sac=(SavingsAccount)aobj;
			System.out.println(str+" Interest Rate: "+sac.getIntRate());
		}
		
		else if(aobj instanceof CurrentAccount)
		{
			CurrentAccount cac=(CurrentAccount)aobj;
			System.out.println(str+" Company Name: "+cac.getCompName());
		}
	}
}
