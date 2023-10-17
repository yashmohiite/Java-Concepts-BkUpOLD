//Assignments2_Day2
//1
public class InstruMain {
	public static void main(String[] args)
	{
		Instrument iobj = null;
		
		iobj = new Piano();
		iobj.play();
		iobj = new Flute();
		iobj.play();
		iobj = new Guitar();
		iobj.play();
		
		Instrument iarr[]=new Instrument[6];
		iarr[0]=new Piano();
		iarr[1]=new Flute();
		iarr[2]=new Guitar();
		iarr[3]=new Piano();
		iarr[4]=new Flute();
		iarr[5]=new Guitar();
		display(iarr);
	}
	
	public static void display(Instrument iarr[])
	{
		for(int i=0; i<iarr.length; i++)
		{
			if(iarr[i] instanceof Piano)
			{
				iarr[i].play();
			}
			if(iarr[i] instanceof Flute)
			{
				iarr[i].play();
			}
			if(iarr[i] instanceof Guitar)
			{
				iarr[i].play();
			}
		}
	}
}
