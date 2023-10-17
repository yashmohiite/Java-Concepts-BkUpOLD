
public class SynchronizedThreadMain {

	public static void main(String[] args) {
		Mobile mobj = new Mobile();
		User u1 = new User(mobj, "ABC");
		User u2 = new User(mobj, "XYZ");
		
		u1.start();
		u2.start();
		
		System.out.println("----Thank You----");
	}

}
