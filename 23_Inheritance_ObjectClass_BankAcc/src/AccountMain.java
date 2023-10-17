//2/12/22
//Modified 7/12/22
import java.util.Scanner;
public class AccountMain {

	/*public static void main(String[] args) {
		SavingsAcc s1=new SavingsAcc(101,"Savings",1000,4.5f);
		CurrentAcc c1=new CurrentAcc(102,"Currents",2000.1234,"Company Name");
		display(s1);
		display(c1);
	}

	public static void display(Account a)
	{
		System.out.println(a);
	}
}*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Enter Cust Details
		System.out.println("Enter Cust ID, Name, Mob No:");
		int custId=sc.nextInt();
		String custName=sc.next();
		String custMob=sc.next();
		//Enter Acc Details
		System.out.println("Enter Acc No");
		int accNo=sc.nextInt();
		System.out.println("Enter Acc Type: 1] Saving 2] Current");
		String accType=sc.next();
		System.out.println("Enter Acc Bal");
		double accBal=sc.nextDouble();
		
		Account aobj=null;
		
		if(accType.equalsIgnoreCase("Saving"))
		{
			System.out.println("Enter Interest Rate");
			float intRate=sc.nextFloat();
			aobj=new SavingsAcc(accNo, accType, accBal, intRate);
		}
		System.out.println("11111111111111111");
		
		if(accType.equalsIgnoreCase("Current"))
		{
			System.out.println("Enter Company Name:");
			String compName=sc.next();
			aobj=new CurrentAcc(accNo, accType, accBal, compName);
		}
		System.out.println("2222222222222222222222");

		Customer cust=new Customer(custId, custName, custMob, aobj);
		display(cust);
		System.out.println("3333333333333333333333");

	}
	
	private static void display(Customer cust)
	{
		System.out.println(cust.toString());
	}
}