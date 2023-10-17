import java.util.Scanner;

public class LogicMain
{
	public static void main(String[] args)
	{
		String str = null;
		Scanner sc = new Scanner(System.in);
		int ch=0;
		Logic lobj = new Logic();
		//lobj.factor(10);
		
		do
		{
			System.out.println("1-Factor\n2-Factorial\n3-Prime\n4-Power\n5-Reverse of a Num\n6-Fibonacci\n7-Pallindrome\n8-Armstrong\n9-Perfect Num\n10-Neon Number\n");
			System.out.println("Enter your Choice\n");
			ch=sc.nextInt();
			
			if(ch==1)
			{
				System.out.println("Enter any Number to find factor");
				lobj.factor(sc.nextInt());
			}
			
			else if(ch==2)
			{
				System.out.println("Enter any Number for factorial");
				System.out.println("Factorial is: "+lobj.factorial(sc.nextInt()));
			}
			
			else if(ch==3)
			{
				System.out.println("Enter any Number to check if Prime");
				//int n = sc.nextInt();
				
				if(lobj.prime(sc.nextInt()))
				{
					System.out.println("Prime Number");
				}
				
				else
				{
					System.out.println("Not a Prime No");
				}
			}
			else if(ch==4)
			{
				System.out.println("Enter any 2 Nos. for Base and Power");
				int b=sc.nextInt();
				int p=sc.nextInt();
				int result=lobj.power(b, p);
				System.out.println("Result is "+result);
			}
			
			else if(ch==5)
			{
				//Reverse of a No.
				
				System.out.println("Enter a Num to get Reverse:");
				System.out.println("Reverse of a Num is: "+lobj.reverse(sc.nextInt()));
			}
			
			else if(ch==6)
			{
				//Fibonacci
				
				System.out.println("Enter how many terms of Fibonacci Series you want to display:");
				lobj.fibo(sc.nextInt());
				
			}
			
			else if(ch==7)
			{
				//Pallindrome Num
				
				System.out.println("Enter a Num to check if pallindrome:");
				
				if(lobj.pall(sc.nextInt()))
				{
					System.out.println("It is a Pallindrome");
				}
				else
				{
					System.out.println("It is Not a Pallindrome");
				}
			}
			
			else if(ch==8)
			{
				//Armstrong
				
				System.out.println("Enter a Num to check if Armstrong:");
				
				if(lobj.Arm(sc.nextInt()))
				{
					System.out.println("It is an Armstrong Num");
				}
				else
				{
					System.out.println("It is NOT an Armstrong Num");
				}
			}
			
			else if(ch==9)
			{
				//Perfect No.
				System.out.println("Enter a Num to check if a Perfect Number:");
				if(lobj.Perf(sc.nextInt()))
				{
					System.out.println("It is a Perfect Number");
				}
				else
				{
					System.out.println("It is NOT a Perfect Number");
				}
			}
			
			else if(ch==10)
			{
				//Neon No.
				
				System.out.println("Enter a Num to check if it is a Neon Number : ");
				
				if(lobj.Neon(sc.nextInt()))
				{
					System.out.println("The given Num is a NEON Number");
				}
				else
				{
					System.out.println("The given Num is NOT A NEON Number");
				}
			}
			
			
			System.out.println("Do you want to continue, Yes or No?");
			str=sc.next();
		}while(str.equals("yes"));
		
		System.out.println("----------Thank You---------");
	}
}


/*
import java.util.Scanner;
public class LogicMain
{
	public static void main(String[] args)
	{
		Logic lobj = new Logic();
		
		lobj.Factors();
		lobj.Factorial();
	}
}
*/