//12/12/22
import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("------WELCOME------");
		
		int n1, n2;
		//System.out.println("Enter 2 Num to perform Division");
		try
		{
		n1=Integer.parseInt(args[0]); //Command Line Arguments. Here, I/P given by: Right Click->Run As->Run Configurations...->Arguments->Program
		n2=Integer.parseInt(args[1]); //Arguments, we can enter multiple Arguments just by giving Space in Between
		System.out.println("Hello");
		int div = n1/n2;
		System.out.println(n1+" Divided by "+n2+" is "+div);
		}
		
		catch(ArithmeticException ex)
		{
			System.err.println(ex);	//Note, Imp Concept
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Exception 2: "+e);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			System.out.println("Always Print");
		}
		System.out.println("Thank You");
	}
}