//6/1/23
import java.util.*;
public class ShopInfo {
	public Customer create()
	{
		Scanner sc = new Scanner(System.in);
		List<Product> lobj = new LinkedList<Product>();
		String str=null;
		
		System.out.println("Enter Customer Details:\n");
		
		System.out.println("Enter Cust ID: ");
		int custId=sc.nextInt();
		System.out.println("Enter Cust Name: ");
		String custName=sc.next();
		System.out.println("Enter Cust Mob No.: ");
		String mobNo=sc.next();
		
		System.out.println("Enter Cust Address: \n");
		
		System.out.println("Enter City: ");
		String city=sc.next();
		System.out.println("Enter State: ");
		String state=sc.next();
		System.out.println("Enter Pincode: ");
		int pincode=sc.nextInt();
		
		Address addr=new Address(city, state, pincode);
		
		do
		{
			System.out.println("Enter Product ID: ");
			int prodId=sc.nextInt();
			System.out.println("Enter Product Name: ");
			String prodName=sc.next();
			System.out.println("Enter Product Price: ");
			double prodPrice=sc.nextDouble();
			
			try
			{
				if(prodPrice<=0)
				{
					throw new MinPriceException();
				}
				System.out.println("Enter Product Qty: ");
				int prodQty=sc.nextInt();
				
				try
				{
					if(prodQty<=0)
					{
						throw new MinQtyException();
					}
					Product prod=new Product(prodId, prodName, prodPrice, prodQty);
					lobj.add(prod);
				}
				catch(MinQtyException e)
				{
					System.err.println(e);
				}
			}
			catch (MinPriceException e)
			{
				System.err.println(e);
			}
			System.out.println("Type yes if you want to add more products: ");
			str=sc.next();
		}while(str.equals("yes"));
		
		Customer cust = new Customer(custId, custName, mobNo, lobj, addr);
		return cust;
	}
	
	public Bill CalculateBill(Customer cust)
	{
		List<Product> lobj = cust.getLobj();
		double total=0, cgst=0, sgst=0, finalTotal=0;
		
		for(Product prod:lobj)
		{
			total=total+prod.getProdPrice() * prod.getProdQty();
		}
		cgst=total * 0.06;
		sgst=total * 0.06;
		finalTotal=total+cgst+sgst;
		Bill billobj = new Bill (new Date(), total, cgst, sgst, finalTotal);
		return billobj;
	}
	
	public void display(Customer cust, Bill billobj)
	{
		System.out.println("==================BILL===================");
		System.out.println("------------CUSTOMER DETAILS-------------");
		System.out.println("Cust ID: "+cust.getCustId());
		System.out.println("Cust Name: "+cust.getCustName());
		System.out.println("Cust Mob No.: "+cust.getCustMob());
		System.out.println("ADDRESS:");
		System.out.println("City: "+cust.getAddr().getCity());
		System.out.println("State: "+cust.getAddr().getState());
		System.out.println("Pincode: "+cust.getAddr().getPincode());
		
		System.out.println("-----------------------------------------");
		
		List<Product> lobj = cust.getLobj();
		
		System.out.println("PRODUCT DETAILS: ");
		System.out.println("ID\tName\tPrice\tQTY\tTotal");
		
		for(Product prod:lobj)
		{
			double total1=prod.getProdPrice() * prod.getProdQty();
			System.out.println(prod.getProdId()+"\t"+prod.getProdName()+"\t"+prod.getProdPrice()+"\t"+prod.getProdQty()+"\t"+billobj.getTotal());
		}
		
		System.out.println("\n------------------------------------------");
		System.out.println("Date            : "+billobj.getDate());
		System.out.println("Bill Total      : "+billobj.getTotal());
		System.out.println("CGST            : "+billobj.getCgst());
		System.out.println("SGST            : "+billobj.getSgst());
		System.out.println("Fial Total      : "+billobj.getFinaltotal());
		System.out.println("====================THANK YOU====================");
	}
}
