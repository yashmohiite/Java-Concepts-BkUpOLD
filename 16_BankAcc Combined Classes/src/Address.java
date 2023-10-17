//21/11/22
public class Address {
	private String City;
	private String State;
	private int pincode;
	public Address(String city, String state, int pincode) {
		super();
		City = city;
		State = state;
		this.pincode = pincode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
