//22/11/22
import java.util.Scanner;
public class BankMain {

	public static void main(String[] args) {
		
		Account acc[]=null;
		Account copyobj=null;
		String str=null;
		
		Scanner sc=new Scanner(System.in);
		
		BankInfo binfo=new BankInfo();
		
		do
		{
			System.out.println("1-Create\n2-Display Acc Info\n3-Search Acc\n4-Transaction");
			System.out.println("Enter your Choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				acc=binfo.createAccount();
				break;
				
			case 2:
				binfo.displayAccount(acc);
				break;
				
			case 3:
				System.out.println("Enter Acc No. to Search In Array of Accounts: ");
				int accno=sc.nextInt();
				copyobj=binfo.searchAccount(acc,  accno);
				if(copyobj!=null)
				{
					System.out.println("Number Found");
				}
				else
				{
					System.out.println("Invalid Account");
				}
				break;
				
			case 4:
				copyobj=null;
				System.out.println("Enter Acc No for Transaction");
				accno=sc.nextInt();
				copyobj=binfo.searchAccount(acc,  accno);
				if(copyobj!=null)
				{
					System.out.println("Enter Amount for Transaction: ");
					double amt=sc.nextDouble();
					binfo.transaction(copyobj, amt);
				}
				break;
			}
			
			System.out.println("Do you want to Continue? Yes OR No");
			str=sc.next();
		}while(str.equals("Yes"));
		
		System.out.println("-----------------------Thank You------------------------");
	}

}
