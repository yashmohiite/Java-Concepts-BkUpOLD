import java.util.Scanner;
public class BankAccInfo {
	
	
	public BankAccVar create()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bank Acc No:");
		int accNo=sc.nextInt();
		System.out.println("Enter Bank Acc Name:");
		String accName=sc.next();
		System.out.println("Enter Bank Acc Balance:");
		double accSal=sc.nextDouble();
		
		BankAccVar bobj = new BankAccVar(accNo, accName, accSal);
		return bobj;
	}
	
	public void display(BankAccVar bobj)
	{
		System.out.println("Account No: "+bobj.getAccNo());
		System.out.println("Account Name: "+bobj.getAccName());
		System.out.println("Account Balance: "+bobj.getAccBal());
	}
}
