import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius for Circle");
		
		float r = sc.nextFloat();
		
		float ca = 3.14f * r * r;	//f means float, here we write it because double has size of 8 bytes,
		//the overall size is greater than float, we can also write (float) like type casting before 3.14 like in C
		
		System.out.println("Area of Circle is :" +ca);
		
		System.out.println("Enter Base and Height of Triangle :");
		
		float b = sc.nextFloat();
		float h = sc.nextFloat();
		
		float ta = (float)0.5 * b * h;	//Note (float) written (For Type casting)
		
		System.out.println("The Area of Triangle is :" +ta);

	}

}
