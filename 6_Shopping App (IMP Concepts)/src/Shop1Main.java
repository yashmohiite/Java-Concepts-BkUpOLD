//A
public class Shop1Main {

	public static void main(String[] args) {
		
		Product1 prod = new Product1();
		
		prod.setProdId(1);
		prod.setProdname("SmartPhones");
		prod.setProdPrice(60000);
		
		System.out.println("Product ID : "+prod.getProdId());
		System.out.println("Product Name : "+prod.getProdname());
		System.out.println("Product Price : "+prod.getProdPrice());

	}

}
