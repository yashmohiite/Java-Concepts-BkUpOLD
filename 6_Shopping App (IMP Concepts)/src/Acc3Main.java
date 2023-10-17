//D2	//17/11/22
//IMP Concept Code
import java.util.Scanner;
public class Acc3Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Acc3 a1[] = accept();
		display(a1);
		
		System.out.println("Enter Acc No to Update");
		int ano = sc.nextInt();
		
		for(int i=0 ; i<a1.length ; i++)
		{
			if(a1[i].getAccNo()==ano)
			{
				updateData(a1[i]);
				break;
			}
		}
	}
	
	public static Acc3[] accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Objects do you want?");
		int n = sc.nextInt();
		//This Array for Acc Class
		Acc3 arr[] = new Acc3[n];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.println("Enter Acc No, Cust Name, Acc Bal:");
			Acc3 a1 = new Acc3(sc.nextInt(), sc.next(), sc.nextDouble());
			arr[i] = a1;
		}
		return arr;
	}
	
	public static void display(Acc3 a1[])
	{
		for(int i=0 ; i<a1.length ; i++)
		{
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("Acc No is : "+a1[i].getAccNo());
			System.out.println("Cust Name is : "+a1[i].getCustName());
			System.out.println("Acc Bal is : "+a1[i].getAccBal());
		}
	}
	
	public static void updateData(Acc3 a)
	{
		a.setAccBal(5000.21);
		System.out.println("Updated Bal is : "+a.getAccBal());
	}

}
