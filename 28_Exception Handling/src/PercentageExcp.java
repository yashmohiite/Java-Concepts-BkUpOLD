//14/12/22
public class PercentageExcp extends Exception{
	public PercentageExcp()
	{
		
	}

	@Override
	public String toString() {
		return "Your Percentage < 70, Not Applicable!";
	}
}
