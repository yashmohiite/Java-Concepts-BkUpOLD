//9/12/22
public class RoyalEnfield implements Automobile, Bike {

	@Override
	public int getCC() {
		// TODO Auto-generated method stub
		return 250;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Himalayan";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "White-Gray";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 375000.12345678;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Model Name is "+getModel()+"\nModel Colour is "+getColor()+"\nBike CC is "+getCC()+"\nModel Price is "+getPrice();
	}

}
