//5/12/22
public class Rect extends Shape{
	private double l, b;

	public Rect(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}

	@Override
	public void findArea() {
		double ra=l*b;
		System.out.println("Area of Rectangle is "+ra);
	}
	
}