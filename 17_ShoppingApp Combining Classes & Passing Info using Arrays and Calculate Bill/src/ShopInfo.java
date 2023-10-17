//21/11/22
import java.util.Date;
import java.util.Scanner;

public class ShopInfo {
	
	public Customer create()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Cust ID: ");
		int custId=sc.nextInt();
		System.out.println("Enter Cust Name: ");
		String cname=sc.next();
		System.out.println("Enter Cust Mob No");
		double mobno=sc.nextDouble();
		System.out.println("-----Enter Address Detail-----");
		System.out.println("Enter City: ");
		String city=sc.next();
		System.out.println("Enter State: ");
		String st=sc.next();
		System.out.println("Enter Pincode: ");
		int pincode=sc.nextInt();
		
		Address addr=new Address(city, st, pincode);
		
		System.out.println("How many Products Do You Want?");
		int n=sc.nextInt();
		
		Product prodarr[]=new Product[n];
		
		for(int i=0; i<prodarr.length; i++)
		{
			System.out.println("Enter Product Id:");
			int prodId=sc.nextInt();
			System.out.println("Enter Product Name:");
			String pname=sc.next();
			System.out.println("Enter Product Price:");
			double price=sc.nextDouble();
			System.out.println("Enter Product Qty:");
			int pqty=sc.nextInt();
			
			Product prod=new Product(prodId, pname, price, pqty);
			prodarr[i]=prod;
		}
		
		Customer cust=new Customer(custId, cname, mobno, addr, prodarr);
		return cust;
	}
	
	public Bill calculateBill(Customer cust)
	{
		Product prodarr[]=cust.getProd();
		double total=0;
		double cgst=0;
		double sgst=0;
		double finaltotal=0;
		
		for(int i=0; i<prodarr.length; i++)
		{
			total=total+prodarr[i].getProdPrice()*prodarr[i].getProdQty();
		}
		
		cgst=total*0.06;
		sgst=total*0.06;
		finaltotal=total+cgst+sgst;
		
		Bill billobj=new Bill(new Date(), total, cgst, sgst, finaltotal);
		return billobj;
	}
	
	public void display(Customer cust, Bill billobj)
	{
		System.out.println("Cust ID: "+cust.getCustId());
		System.out.println("Cust Name: "+cust.getCustName());
		System.out.println("Cust Mob No: "+cust.getCustMob());
		System.out.println("------ADDRESS------");
		System.out.println("City: "+cust.getAddr().getCity());
		System.out.println("State: "+cust.getAddr().getState());
		System.out.println("Pincode: "+cust.getAddr().getPincode());
		System.out.println("------PRODUCT DATA------");
		
		Product prodarr[]=cust.getProd(); //Return Array From Cust Class
		for(int i=0; i<prodarr.length; i++)
		{
			System.out.println("Product ID: "+prodarr[i].getProdId()); //This and Below Method, both can be used to get Data. Choose What's Easy and Correct
			System.out.println("Product Name: "+cust.getProd()[i].getProdName());
			System.out.println("Product Price: "+cust.getProd()[i].getProdPrice());
			System.out.println("Product Qty: "+cust.getProd()[i].getProdQty());
		}
		
		System.out.println("------BILL------");
		System.out.println("Bill Date: "+billobj.getDate());
		System.out.println("Bill Total: "+billobj.getTotal());
		System.out.println("Bill CGST: "+billobj.getCgst());
		System.out.println("Bill SGST: "+billobj.getSgst());
		System.out.println("Final Total: "+billobj.getFinaltotal());
		System.out.println("-----------------------------");
	}
}