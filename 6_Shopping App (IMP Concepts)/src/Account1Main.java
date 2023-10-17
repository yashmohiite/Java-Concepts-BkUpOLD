//B
public class Account1Main {

	public static void main(String[] args) {
		
		Account1 acc = new Account1(101,"Ganesh",10000); //Using Constructors instead of Setting Values Separately using- 
		//-obj.setvar(argument/parameter) method for each Variable
		
		System.out.println("Account No is : "+acc.getAccNo());
		System.out.println("Account Holder's Name is : "+acc.getCustName());
		System.out.println("Account Balance is : "+acc.getAccBal());

	}

}
