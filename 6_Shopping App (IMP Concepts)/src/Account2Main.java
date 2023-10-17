//D //17/11/22
import java.util.Scanner;
public class Account2Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Acc No, Acc Holder's Name, Acc Bal : ");
		Account2 a1 = new Account2(sc.nextInt(), sc.next(), sc.nextDouble()); //Note this Another Input Taking Way //Passed Data to Constructors
		
		System.out.println("Acc No is : "+a1.getAccNo()); //Called the GETTER Methods
		System.out.println("Acc Holder's Name is : "+a1.getCustName());
		System.out.println("Acc Bal is : "+a1.getAccBal());
	}
}

/*//Modified Later in Video Lectures:
 * 
 * import java.util.Scanner;
 * 
 * public class Account2Main
 * {
 * 		public void main(String[] args)
 * 		{
 * 			Account2 a1=accept();
 * 			display(a1);
 * 		}
 * 
 * 		public static Account accept()
 * 		{
 * 			Scanner sc = new Scanner(System.in);
 * 
 * 			System.out.println("Enter Acc No, Cust Name, Acc Bal:");
 * 			Account2 a1 = new Account2(sc.nextInt(), sc.next(), sc.nextDouble());
 * 			return a1;
 * 		}
 * 
 * 		public static void display(Account2 a1)
 * 		{
 * 			System.out.println("Acc No is : "+a1.getAccNo());
			System.out.println("Acc Holder's Name is : "+a1.getCustName());
			System.out.println("Acc Bal is : "+a1.getAccBal());	
 * 		}
 * }
 * 
 * */

/*// Modified Above for an Array
 * 
 * 	In D2, Acc and AccMain
 * 
 * */
