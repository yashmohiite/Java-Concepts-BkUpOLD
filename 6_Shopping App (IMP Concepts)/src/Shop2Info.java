//C
//Imp Concepts in these Codes
import java.util.Scanner;
public class Shop2Info {
	
	public Product2 create()	//Note, Imp Concept
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Id");
		int prodId=sc.nextInt();
		
		System.out.println("Enter Product Name");
		String prodName=sc.next();
		
		System.out.println("Enter Product Price");
		double prodPrice=sc.nextDouble();
		
		System.out.println("Enter Product Qty");
		int prodQty=sc.nextInt();
		
		Product2 prod = new Product2(prodId, prodName, prodPrice, prodQty);
		
		return prod;	
	}
	
	public void display(Product2 prod)	//Note, Imp Concept	
	{
		System.out.println("Product ID:"+prod.getProdId());
		System.out.println("Product Name:"+prod.getProdName());
		System.out.println("Product Price:"+prod.getProdPrice());
		System.out.println("Product Qty:"+prod.getProdQty());
	}
}