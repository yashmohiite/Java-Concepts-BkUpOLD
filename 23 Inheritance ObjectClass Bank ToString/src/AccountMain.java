//2/12/22
public class AccountMain {

	public static void main(String[] args) {
		SavingsAcc s1=new SavingsAcc(101,"Savings",1000,4.5f);
		CurrentAcc c1=new CurrentAcc(102,"Currents",2000.1234,"Company Name");
		display(s1);
		display(c1);
	}

	public static void display(Account a)
	{
		System.out.println(a);
	}
}