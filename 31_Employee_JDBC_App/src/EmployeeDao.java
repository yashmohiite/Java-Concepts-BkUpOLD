//24/01/23
import java.util.List;
public interface EmployeeDao {
	public int createRecord(List<Employee> lst);
	public int deleteRecord(int n);
	public int updateRecord(List<Employee> lst);
	public List<Employee> searchRecord(int n);
	//public List<Employee> displayAll();
}
