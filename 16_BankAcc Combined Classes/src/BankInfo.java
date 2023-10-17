//21/11/22
import java.util.Scanner;
public class BankInfo {
	public Customer createAcc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Cust Id, Cust Name, Cust MobNo");
		int custId=sc.nextInt();
		String custName=sc.next();
		int custMobNo=sc.nextInt();
		
		
		System.out.println("Enter Customer City, State, PinCode");
		String city=sc.next();
		String state=sc.next();
		int pincode=sc.nextInt();
		
		
		System.out.println("Enter Acc No, Acc Type, Acc Bal");
		int accNo=sc.nextInt();
		String accType=sc.next();
		double accBal=sc.nextDouble();
		
		Account acc=new Account(accNo, accType, accBal);
		Address addr=new Address(city, state, pincode);
		Customer cust=new Customer(custId, custName, custMobNo, addr, acc);
		return cust;
	}
	
	public void displayAccount(Customer cust)
	{
		System.out.println("Cstomer ID: "+cust.getCustId());
		System.out.println("Customer Name: "+cust.getCustName());
		System.out.println("Customer Mob No: "+cust.getMobNo());
		System.out.println("----------------ADDRESS--------------");
		System.out.println("Customer City: "+cust.getAddr().getCity());
		System.out.println("Customer State: "+cust.getAddr().getState());
		System.out.println("Customer Pincode: "+cust.getAddr().getPincode());
		System.out.println("----------------ACCOUNT DETAILS--------------");
		System.out.println("Acc No: "+cust.getAcc().getAccNo());
		System.out.println("Acc Type: "+cust.getAcc().getAccType());
		System.out.println("Acc Bal: "+cust.getAcc().getAccBal());
	}
}
