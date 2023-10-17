//23/12/22
import java.util.Map;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		Map<String, Double> carmap=new TreeMap<String, Double>();
		carmap.put("Maruti", 900000.1234);
		carmap.put("Toyota", 1900000.78612);
		carmap.put("TATA", 1200000.85463);
		carmap.put("BMW", 8500000.964872);
		System.out.println("Car Map (Tree Map) : "+carmap);
		
		Map<String, Double> carmap2=new HashMap<String, Double>();
		carmap2.put("Maruti Suzuki", 1000000.9874);
		carmap2.put("Toyota", 2000000.632519);
		carmap2.put("TATA", 1300000.71265);
		carmap2.put("BMW", 9900000.144862);
		System.out.println("Car Map (Hash Map) : "+carmap2);
	}

}
