//9/12/22
public class HeroHonda implements Automobile,Bike{

	@Override
	public int getCC() {
		// TODO Auto-generated method stub
		return 125;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Splendor";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Gray";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 75990.123456;
	}

	@Override
	public String toString() {
		return "Model Name is "+getModel()+"\nModel Colour is "+getColor()+"\nBike CC is "+getCC()+"\nModel Price is "+getPrice();
	}

}
