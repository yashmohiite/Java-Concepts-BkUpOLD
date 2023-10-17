//14/12/22
import java.util.Scanner;
public class InvalidAgeExceptionMain {

	public static void main(String[] args) {
		int rno;
		String sname;
		float perct;
		int age;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Roll No: ");
		rno=sc.nextInt();
		System.out.println("Enter Student Name: ");
		sname=sc.next();
		System.out.println("Enter Student Percentage: ");
		perct=sc.nextFloat();
		System.out.println("Enter Student Age: ");
		age=sc.nextInt();
		display(age, perct);
		/*try
		{
			if(perct<70)
			{
				throw new PercentageExcp();
			}
			System.out.println("Valid Percentage, Criteria Fulfilled");
		}
		catch(PercentageExcp ex)
		{
			System.err.println("Exception Occurred! "+ex);
		}*/
		System.out.println("Thank You!");
	}
	
	public static void display(int age, float perct)
	{
		try
		{
		if(age<18)	//Select, then Right Click -> Surround With
			{
				throw new InvalidAgeException();
			}
		if(perct<70)
		{
			throw new PercentageExcp();
		}
			System.out.println("Valid Profile, Student is Eligible.");
		}
		catch(InvalidAgeException e)
		{
			System.err.println("Exception Occurred! "+e);
		} catch (PercentageExcp e) 
		{
			e.printStackTrace(); //Details About Exception
		}
	}

}
