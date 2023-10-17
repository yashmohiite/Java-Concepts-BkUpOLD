//Assignment 1, 14/11/22
import java.util.Scanner;
public class EvenNumbersMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		EvenNumbers eobj = new EvenNumbers();
		
		System.out.println("Enter a Num till which you want to List all Even Numbers:");
		eobj.evenlist(sc.nextInt());
		
		sc.close();

	}

}
