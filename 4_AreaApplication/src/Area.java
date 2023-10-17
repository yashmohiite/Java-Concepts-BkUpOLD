import java.util.Scanner;
public class Area 
	{
	
		Scanner sc = new Scanner(System.in);
		public void circleArea()
		{
			System.out.println("Enter Rad for Circle");
			float r = sc.nextFloat();
			float ca = 3.14f * r * r;
			System.out.println("Area of Circle: "+ca);
		}
		
		public void triangleArea()
		{
			System.out.println("Enter Base and Height:");
			float b = sc.nextFloat();
			float h = sc.nextFloat();
			float ta = 0.5f * b * h;
			
			System.out.println("Area of Triangle is : "+ta);
		}

	}
