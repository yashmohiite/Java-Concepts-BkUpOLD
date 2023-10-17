//8/12/22
public class Triangle implements Shape {
	private double b;
	private double h;
	public Triangle(double b, double h) {
		super();
		this.b = b;
		this.h = h;
	}
	@Override
	public double findArea() {
		return 0.5*b*h;
	}
	@Override
	public void sayThanks() {
		System.out.println("Thanks to All from Triangle");
	}
}