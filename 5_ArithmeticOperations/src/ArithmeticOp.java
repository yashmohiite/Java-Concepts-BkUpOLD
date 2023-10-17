import java.util.Scanner;

public class ArithmeticOp 
{
	Scanner sc = new Scanner(System.in);
	
	public void addData()
	{
		System.out.println("Add here");
		System.out.println("Enter any 2 Nos.");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int add = n1 + n2;
		
		System.out.println("Addition is "+add);
	}
	
	public void subData()
	{
		System.out.println("Sub here");
		System.out.println("Enter any 2 Nos.");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int sub = n1 - n2;
		
		System.out.println("Subtraction is "+sub);
	}
	
	public void mulData()
	{
		System.out.println("Mul here");
		System.out.println("Enter any 2 Nos.");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int mul = n1 * n2;
		
		System.out.println("Multiplication is "+mul);
	}
	
	public void divData()
	{
		System.out.println("Div here");
		System.out.println("Enter any 2 Nos.");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int div = n1/n2;
		
		System.out.println("Division is "+div);
	}
}
