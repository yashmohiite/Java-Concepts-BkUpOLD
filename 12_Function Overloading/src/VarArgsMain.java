//16/11/22
public class VarArgsMain {

	public static void main(String[] args) {
		VarArgs v = new VarArgs();
		
		v.display();
		v.display(10);
		v.display(10,20,30);
		
		System.out.println("-----------------------------------------------------------------------------------------");
		
		v.display(1.1f);
		v.display(1.1f,10,20);
	}

}
