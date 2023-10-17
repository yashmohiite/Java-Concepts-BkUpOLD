//20/12/22
import java.util.*;
public class ProductShopInfo2 {
	public List<Product2> create()
	{
		List<Product2> lst=new ArrayList<Product2>();
		Scanner sc=new Scanner(System.in);
		String ch=null;
		
		do
		{
			System.out.println("Enter Product ID, Name, Price, Quantity: ");
			
			Product2 p=new Product2(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
			
			lst.add(p);
			
			System.out.println("Do you want to add more Products? Y/N: ");
			ch=sc.next();
			
		}while(ch.equals("Y")||ch.equals("y")||ch.equals("Yes")||ch.equals("yes"));
		return lst;
	}
	
	public static void display(List<Product2> lst)
	{
		for(Product2 p:lst)
		{
			System.out.println(p.getProdId()+"\t"+p.getProdName()+"\t"+p.getProdPrice()+"\t"+p.getProdQty());
		}
	}
}
