//5/12/22
public class Circle extends Shape{
	private double r;

	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public void findArea() {
		double ca = 3.14f*r*r;
		System.out.println("Area of Circle is "+ca);
	}
}