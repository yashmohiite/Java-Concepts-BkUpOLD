import java.util.Scanner;
public class CalculationApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Java");
		
		int n1, n2, add;
		
		System.out.println("Enter any 2 Nos.");
		
		Scanner scobj = new Scanner(System.in);
		
		n1 = scobj.nextInt();
		n2 = scobj.nextInt();
		
		add = n1 + n2;
		
		System.out.println("Addition is "+add);

	}

}
//	In java we have 8 Primitive Data Types : byte, 1; 	short, 2;	 int, 4;	 long, 8; 	float, 4; 	
//double, 8; 	char, 2; 	boolean, 1