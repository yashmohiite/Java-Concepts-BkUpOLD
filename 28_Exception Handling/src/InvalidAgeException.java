//14/12/22
public class InvalidAgeException extends Exception{
	
	public InvalidAgeException()	//No Argument Constructor
	{
		
	}

	@Override
	public String toString() {
		return "Your Age < 18, Not Applicable!";
	}	
}