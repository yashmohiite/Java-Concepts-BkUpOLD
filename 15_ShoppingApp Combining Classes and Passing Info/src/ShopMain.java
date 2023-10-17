//18/11/22
public class ShopMain {

	public static void main(String[] args) {
		
		ShopInfo sinfo = new ShopInfo();
		Customer cust = sinfo.create();
		sinfo.display(cust);
		
	}
}