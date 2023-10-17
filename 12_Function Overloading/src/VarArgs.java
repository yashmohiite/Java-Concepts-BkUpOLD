//16/11/22
public class VarArgs {
	
	public void display(int ...x)
	{
		System.out.println("Display Length "+x.length);
		for(int i:x) //for(i=0 ; i<x.length ; i++)
		{
			System.out.println(i);
		}
	}
	
	public void display(float f, int ...x)
	{	
		System.out.println("Display Length of Array X : "+x.length);
		//one float 0 int
		//one float 1 int
		//one float many int
		System.out.println(f);
		for(int i:x)
		{
			System.out.println(i);
		}
	}
}
