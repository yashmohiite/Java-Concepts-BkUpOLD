import java.util.Scanner;
public class RectangleInfo {
	
	public RectangleDataCreate[] create()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many Rectangle Areas you need to Calculate?");
		int n = sc.nextInt();
		
		RectangleDataCreate rectarr[] = new RectangleDataCreate[n];
		
		for(int i=0 ; i<rectarr.length ; i++)
		{
			System.out.println("Enter L of Rect");
			double rectlen = sc.nextDouble();
			System.out.println("Enter B of Rect");
			double rectbrt = sc.nextDouble();
			
			double rectarea = rectlen*rectbrt;
			
			RectangleDataCreate rec = new RectangleDataCreate(rectlen,rectbrt,rectarea);
			rectarr[i]=rec;
		}
		return rectarr;
	}
	
	public void calculation(RectangleDataCreate rec[])
	{
		int a=1;
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("\n");
		
		for(int i=0 ; i<rec.length; i++)
		{
			System.out.println("\n"+rec[i].getRecL()+"\t"+rec[i].getRecB()+"\t"+rec[i].getRecArea());
		}
	}
}
