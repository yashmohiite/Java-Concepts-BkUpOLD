//22/11/22
import java.util.Scanner;
public class BankInfo {
	Scanner sc=new Scanner(System.in);
	
	public Account[] createAccount()
	{
		System.out.println("How many Objects Do you Want in Array");
		int n=sc.nextInt();
		
		Account accarr[]=new Account[n];
		for(int i=0; i<accarr.length; i++)
		{
			System.out.println("Enter Acc No, Acc Type, Acc Bal:");
			int accNo=sc.nextInt();
			String accType=sc.next();
			double accBal=sc.nextDouble();
			Account accobj=new Account(accNo, accType, accBal);
			accarr[i]=accobj;
		}
		return accarr;
	}
	
	public Account searchAccount(Account accarr[], int accno)
	{
		Account temp=null;
		for(int i=0; i<accarr.length; i++)
		{
			if(accarr[i].getAccNo()==accno)
			{
				temp=accarr[i];
				break;
			}
		}
		return temp;
	}
	
	public void displayAccount(Account accobj[])
	{
		for(int i=0; i<accobj.length; i++)
		{
			System.out.println("---------------------------------");
			System.out.println("Acc Num: "+accobj[i].getAccNo());
			System.out.println("Acc Type: "+accobj[i].getAccType());
			System.out.println("Acc Bal: "+accobj[i].getAccBal());
		}
	}
	
	public void transaction(Account copyobj, double amt)
	{
		System.out.println("1-Withdrawal\n2-Deposit");
		System.out.println("Enter Your Choice: ");
		int ch=sc.nextInt();
		
		Transaction t=new Transaction();
		if(ch==1)
		{
			t.withdrawal(copyobj, amt);
		}
		else if(ch==2)
		{
			t.deposit(copyobj,  amt);
		}
		System.out.println("After Transaction, Remaining Bal: "+copyobj.getAccBal());
	}
}
