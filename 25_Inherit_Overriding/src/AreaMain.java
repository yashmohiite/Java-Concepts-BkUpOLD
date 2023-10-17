//5/12/22
public class AreaMain {

	public static void main(String[] args) {
		Shape s = null;
		
		s=new Circle(2.2);
		s.findArea();
		
		s=new Triangle(2.2,3.3);
		s.findArea();
		
		s=new Rect(2.0,3.0);
		s.findArea();
		
		//Using Array
		Shape sarr[]=new Shape[5]; //We can create Array of Abstract Class
		sarr[0]=new Circle(4.12);
		sarr[1]=new Triangle(3.1,4.1);
		sarr[2]=new Triangle(0.5,0.5);
		sarr[3]=new Rect(4.5,8.5);
		sarr[4]=new Rect(7.1, 4.1);
		display(sarr);
	}
	
	public static void display(Shape sarr[])
	{
		for(int i=0; i<sarr.length; i++)
		{
			if(sarr[i] instanceof Circle)
			{
				sarr[i].findArea();
			}
			if(sarr[i] instanceof Triangle)
			{
				sarr[i].findArea();
			}
			if(sarr[i] instanceof Rect)
			{
				sarr[i].findArea();
			}
		}
	}
}