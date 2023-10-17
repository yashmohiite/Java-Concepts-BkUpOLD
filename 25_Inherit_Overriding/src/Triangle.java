//5/12/22
public class Triangle extends Shape{
	double b, h;

	public Triangle(double b, double h) {
		super();
		this.b = b;
		this.h = h;
	}

	@Override
	public void findArea() {
		double ta = 0.5f * b * h;
		System.out.println("Area of Triangle is "+ta);
	}
}