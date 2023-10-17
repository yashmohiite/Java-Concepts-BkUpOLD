//9/12/22
public class Bajaj implements Automobile, Bike {

	@Override
	public int getCC() {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Pulsar NS 200";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Racing Red";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 212000.845691;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Model Name is "+getModel()+"\nModel Colour is "+getColor()+"\nBike CC is "+getCC()+"\nModel Price is "+getPrice();
	}

}
