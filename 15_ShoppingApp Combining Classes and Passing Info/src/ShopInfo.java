//18/11/22
public class ShopInfo {
	
	public Customer create()
	{
		Product prod = new Product(1, "Mobile", 20000, 2);
		Address addr = new Address("Pune", "MH", 411005);
		Customer cust = new Customer(101, "Ganesh", "12345", prod, addr);
		return cust;
	}
	
	public void display(Customer cust)
	{
		System.out.println("Customer Id :"+cust.getCustId());
		System.out.println("Customer Name : "+cust.getCustName());
		System.out.println("Customer Mob No : "+cust.getMobNo());
		System.out.println("----------------------------------------------------------------");
		
		Product prod = cust.getProd();
		
		System.out.println("Product Id : "+prod.getProdId());
		System.out.println("Product Name : "+cust.getProd().getProdName());
		System.out.println("Product Price : "+cust.getProd().getProdPrice());
		System.out.println("Product Qty : "+cust.getProd().getProdQty());
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("City : "+cust.getAddr().getCity());
		System.out.println("State : "+cust.getAddr().getState());
		System.out.println("Pincode : "+cust.getAddr().getPincode());
		
		System.out.println("----------------------------------------------------------------");
	}
}