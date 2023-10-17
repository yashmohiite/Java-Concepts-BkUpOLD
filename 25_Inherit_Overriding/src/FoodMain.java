//6/12/22 
//What is Abstract Class?
//What is Dynamic Polymorphism or Run-Time Polymorphism?
public class FoodMain {

	public static void main(String[] args) {
		Food farr[]=new Food[5];
		farr[0]=new ButterPaneer();
		farr[0].Recipe();
		farr[1]=new ButterChicken();
		farr[1].Recipe();
		farr[2]=new Pasta();
		farr[2].Recipe();
		farr[3]=new Ramen();
		farr[3].Recipe();
	}
}