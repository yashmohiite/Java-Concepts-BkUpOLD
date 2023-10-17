//8/12/22
public class Circle implements Shape {
	private double r;
	final double Pi=3.14;
	public Circle(double r) {
		super();
		this.r = r;
	}
	
	
	@Override
	public double findArea() {
		return Pi*r*r;
	}
	
	
	@Override
	public void sayThanks() {
		System.out.println("Thanks to All From CIrcle");
	}
}