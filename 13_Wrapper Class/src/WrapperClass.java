import java.util.LinkedList;
public class WrapperClass {

	public static void main(String[] args) {
		int n1=10; //Primitive data type
		System.out.println("Value of n1 is: "+n1);
		//Primitive to Obj = Boxing
		Integer iobj = new Integer(n1); //Boxing
		//Object to Primitive is called Unboxing
		int a=iobj.intValue();
		//Java 5
		int x=10;
		Integer iobj2=x; //Auto Boxing
		int z=iobj2; //Auto Unboxing
		String s="10";
		int n=Integer.parseInt(s);
		String s2=Integer.toString(n);
	}

}
