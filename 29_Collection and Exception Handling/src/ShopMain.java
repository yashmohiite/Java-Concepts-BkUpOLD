//6/1/23
//ERROR IN INDIVIDUAL TOTALS
import java.util.*;
public class ShopMain {

	public static void main(String[] args) {
		String str = null;
		Scanner sc=new Scanner(System.in);
		
		do
		{
			ShopInfo sinfo = new ShopInfo();
			Customer cust = sinfo.create();
			Bill billobj=sinfo.CalculateBill(cust);
			sinfo.display(cust, billobj);
			System.out.println("To Continue Press 1: ");
			str=sc.next();
		}while(str.contentEquals("1"));
	}

}
