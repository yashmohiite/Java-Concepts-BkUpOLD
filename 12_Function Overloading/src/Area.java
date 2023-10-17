//16/11/22
public class Area {
	public void calcArea(float r)
	{
		float ca = 3.14f * r * r;
		System.out.println("Area of Circle is "+ca);
	}
	
	public void calcArea(float b, float h)
	{
		float ta = 0.5f * b * h;
		System.out.println("Area of Triangle is "+ta);
	}
}
