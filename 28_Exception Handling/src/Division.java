//12/12/22
import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("------WELCOME------");
		System.out.println("Enter 2 Num to perform Division");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		try
		{
		System.out.println("Hello");
		int div = n1/n2;
		System.out.println(n1+" Divided by "+n2+" is "+div);
		}
		catch(ArithmeticException ex)
		{
			System.err.println(ex);	//Note, Imp Concept
		}
		System.out.println("Thank You");
	}
}