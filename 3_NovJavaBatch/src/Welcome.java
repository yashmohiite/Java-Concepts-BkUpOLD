import java.util.Scanner;
public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Java");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 Nos.");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int add = n1 + n2;
		
		System.out.println("Number1 = "+n1);
		System.out.println("Number2 = "+n2);
		System.out.println("Addition is = "+add);

	}

}
