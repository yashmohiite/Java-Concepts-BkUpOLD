//8/12/22
public class ShapeMain {

	public static void main(String[] args) {
		Shape s=null;
		s=new Circle(2.2);
		System.out.println("Area of Circle is "+s.findArea());
		s.sayThanks();
		
		s=new Triangle(2.2,3.3);
		System.out.println("Area of Triangle is "+s.findArea());
		s.sayThanks();
	}
}