public class Logic
{
	public void factor(int n) //10
	{
		for(int i=2 ; i<=n/2 ; i++)
		{
			if(n%i==0)
			{
				System.out.println(i); //2 5
			}
		}
	}
	
	public int factorial(int n)
	{
		int result = 1;
		for(int i=1 ; i<=n ; i++)
		{
			result = result*i; //1*1=1*2=2*3
		}
		return result;
	}
	
	public boolean prime(int n)
	{
		boolean b = true;
		for(int i=2 ; i<=n/2 ; i++)
		{
			if(n%i==0)
			{
				b=false;
				break;
			}
		}
		return b;
	}
	
	public int power(int b, int p)
	{
		int result = 1;
		for(int i=1 ; i<=p ; i++)
		{
			result = result * b;
		}
		return result;
	}
	
	public int reverse(int n)
	{
		int revnum = 0;
		
		while(n!=0)
		{
			int rem = n%10;
			
			//int revnum = 0;
			revnum = revnum*10 + rem;
			
			n = n/10;
		}
		
		return revnum;
	}
	
	public void fibo(int n)
	{
		int i=1, j=1;
		
		System.out.println(" "+i+"\n "+j);
		
		for(int c=1 ; c<=n-2 ; c++)
		{
			int k = i + j;
			
			System.out.println(" "+k);
			
			i=j;
			j=k;
		}
	}
	
	public boolean pall(int n)
	{
		int temp = n, revnum = 0; 
		boolean a = false;
		
		while(n>0)
		{
			int rem = n%10;
			revnum = revnum * 10 + rem;
			n = n/10;
		}
		
		if(revnum==temp)
		{
			a = true;
		}
		
		return a;
	}
	
	public boolean Arm(int n)
	{
		boolean a = false;
		int temp=n, result = 0;
		
		while(temp!=0)
		{
			int rem = temp % 10;
			result = result + rem * rem * rem;
			temp = temp / 10; //temp /= 10
		}
		
		if(result==n)
		{
			a = true;
		}
		
		return a;
	}
	
	public boolean Perf(int n)
	{
		boolean b = false;
		int sum=0; int temp = n;
		for(int i=1 ; i<=n/2 ; i++)
		{
			if(n % i == 0)
			{
				sum = sum + i;
			}
		}
		
		if(sum==temp)
		{
			b = true;
		}
		return b;
	}
	
	public boolean Neon(int n)
	{
		boolean b = false;
		
		int sq = n*n;
		int temp=sq;
		int sum = 0;
		while(temp!=0)
		{
			int rem = temp % 10;
			temp = temp / 10;
			int rem2 = temp % 10;
			temp = temp / 10;
			sum = rem + rem2;
		}
		if(sum==n)
		{
			b=true;
		}
		
		return b;
	}
}



/*
import java.util.Scanner;

public class Logic
{
	
	Scanner sc = new Scanner(System.in);
	
	public void Factors()
	{
		System.out.println("Enter Num to find its Factors");
		int num = sc.nextInt();
		int i, factor;
		
		for (i = 2 ; i <= num/2 ; i++)
		{
			factor = num % i;
			
			if (factor == 0)
			{
				System.out.println(i+" is a factor of "+num);
			}
		}
	}
	
	public void Factorial()
	{
		System.out.println("Enter Number to find Factorial");
		
		int num1 = sc.nextInt();
		
		int i = 1, factorial = 1;
		
		while(i <= num1)
		{
			factorial = factorial * i;
			i++;
		}
		
		System.out.println("Factorial of " +num1+ " is " +factorial);
	}
}
*/
