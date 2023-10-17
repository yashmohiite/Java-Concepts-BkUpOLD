//20/12/22
import java.util.*;
public class ProductShopMain2 {

	public static void main(String[] args) {
		ProductShopInfo2 pinfo=new ProductShopInfo2();
		
		/*List<Product2> lst = pinfo.create();
		pinfo.display(lst);
		*/
		
		//Or Display & Create Functions in One Line:
		pinfo.display(pinfo.create());
		System.out.println("--------------------------THANK YOU---------------------------");
	}

}
