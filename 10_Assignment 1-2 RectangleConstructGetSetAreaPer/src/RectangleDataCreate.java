//Question 2 of Assignment 14/11/22
public class RectangleDataCreate {
	
	//Instance Variables:
	private double recL;
	private double recB;
	private double recArea;
	
	//Constructors create/Allocate Memory for above Variables in Heap Memory of System
	public RectangleDataCreate(double recL, double recB, double recArea) {
		super();
		this.recL = recL; //We write 'this' only when variables and arguments/parameters Names are same, to resolve Ambiguity
		this.recB = recB; //this points to instance variable
		this.recArea = recArea;
	}
	
	
	
	
	
	public double getRecL() {
		return recL;
	}
	public void setRecL(double recL) {
		this.recL = recL;
	}
	
	
	
	
	
	public double getRecB() {
		return recB;
	}
	public void setRecB(double recB) {
		this.recB = recB;
	}
	
	
	
	
	
	public double getRecArea() {
		return recArea;
	}
	public void setRecArea(double recArea) {
		this.recArea = recArea;
	}

}
