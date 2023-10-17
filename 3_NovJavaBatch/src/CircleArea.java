import java.util.Scanner;
public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Rad of Circle to Calculate Area:");
		
		Scanner sc = new Scanner(System.in);
		
		float r = sc.nextFloat();
		
		float ca = 3.14f * r * r;
		
		System.out.println("Area of Circle is: "+ca);

	}

}
