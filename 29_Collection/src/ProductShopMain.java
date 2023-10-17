//19/12/22	HW
import java.util.*;
public class ProductShopMain {

	public static void main(String[] args) {
		String ch=null;
		Scanner sc=new Scanner(System.in);
		
		List<Product> lst=new ArrayList<Product>();
		
		do
		{
			System.out.println("Enter Product ID, Name, Price, Quantity: ");
			
			Product p=new Product(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
			
			lst.add(p);
			
			System.out.println("Do you want to add more Products? Y/N: ");
			ch=sc.next();
			
		}while(ch.equals("Y")||ch.equals("y")||ch.equals("Yes")||ch.equals("yes"));
		
		display(lst);
		
		System.out.println("---------------------Thank You---------------------");
		
	}
	
	public static void display(List<Product> lst)
	{
		for(Product p:lst)
		{
			System.out.println(p.getProdId()+"\t"+p.getProdName()+"\t"+p.getProdPrice()+"\t"+p.getProdQty());
		}
	}
}