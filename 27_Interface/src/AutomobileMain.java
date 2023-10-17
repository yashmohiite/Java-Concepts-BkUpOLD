//8/12/22
import java.util.Scanner;
public class AutomobileMain {
	public static void main(String[] args) {
		int ch = 0;
		Automobile a=null;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("------AUTOMOBILES------");
		System.out.println("1-Cars\n2-Bikes\nEnter Choice\n");
		int ch2=sc.nextInt();
		if(ch2==1)
		//do
		{
			System.out.println("1-Maruti \n2-Toyota \n3-BMW");
			System.out.println("Enter Your Choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("------Welcome to Maruti------");
				a=new Maruti();
				display(a, "Maruti");
				break;
				
			case 2:
				System.out.println("------Welcome to Toyota------");
				a=new Toyota();
				display(a, "Toyota");
				break;
				
			case 3:
				System.out.println("------Welcome to BMW------");
				a=new BMW();
				display(a, "BMW");
				break;
			}
			//System.out.println("Do you want to Continue, Press Yes or No");
		}//while(sc.next().equals("yes"));
		else if(ch2==2)
		{
			HeroHonda hhobj=new HeroHonda();
			RoyalEnfield reobj=new RoyalEnfield();
			Bajaj bobj=new Bajaj();
			System.out.println("1-Hero Honda\n2-Royal Enfield\n3-Bajaj\nEnter Your Choice\n");
			int ch3=sc.nextInt();
			switch(ch3)
			{
			case 1:
				System.out.println(hhobj);
				break;
			case 2:
				System.out.println(reobj);
				break;
			case 3:
				System.out.println(bobj);
				break;
			}
		}
		System.out.println("Thank You");
	}
	public static void display(Automobile a, String str)
	{
		System.out.println("Model Name is "+str+" "+a.getModel());
		System.out.println("Model Color is "+str+" "+a.getColor());
		System.out.println("Model Price is "+str+" "+a.getPrice());
	}
}