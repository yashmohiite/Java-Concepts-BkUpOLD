//16/11/22
public class Greater {
	public void calGr8(int a, int b)
	{
		if(a>b)
		{
			System.out.println(a+" is Greater than "+b);
		}
		else if(b>a)
		{
			System.out.println(b+" is Greater than "+a);
		}
		else
		{
			System.out.println("Invalid, Please Try Again");
		}
	}
	
	public void calGr8(float a , float b)
	{
		if(a>b)
		{
			System.out.println(a+" is Greater Float than "+b);
		}
		else if(b>a)
		{
			System.out.println(b+" is Greater Float than "+a);
		}
		else
		{
			System.out.println("Invalid, Please Try Again");
		}
	}
	
	public void calGr8(char a , char b)
	{
		//int ch = 65;
		if(a>b)
		{
			System.out.println(a+" is Greater Char than "+b);
		}
		else if(b>a)
		{
			System.out.println(b+" is Greater Char than "+a);
		}
	}
}
