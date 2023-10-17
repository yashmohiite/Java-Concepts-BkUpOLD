//24/01/23
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
public class EmployeeDaoImpl implements EmployeeDao{
	public int createRecord(List<Employee> lst)
	{
		int i=0;
		Connection con=DBConnection.getConnection();
		try
		{
			PreparedStatement pstate=con.prepareStatement("insert into empdb values(?,?,?)");
			Employee eobj=lst.get(0);
			pstate.setInt(1, eobj.getEmpId());
			pstate.setString(2,  eobj.getEmpName());
			pstate.setDouble(3,  eobj.getEmpSal());
			i=pstate.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}
	
	public int deleteRecord(int empid)
	{
		int i=0;
		Connection con=DBConnection.getConnection();
		try
		{
			PreparedStatement pstate=con.prepareStatement("delete from empdb where empid=?");
			pstate.setInt(1, empid);
			i=pstate.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}
	
	public int updateRecord(List<Employee> lst)
	{
		int i=0;
		Connection con=DBConnection.getConnection();
		try
		{
			PreparedStatement pstate=con.prepareStatement("update empdb set empsal=? where empid=?");
			Employee etemp=lst.get(0);
			pstate.setDouble(1,  etemp.getEmpSal());
			pstate.setInt(2, etemp.getEmpId());
			i=pstate.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}
	
	public List<Employee> searchRecord(int eid)
	{
		int i=0;
		Connection con=DBConnection.getConnection();
		List<Employee> lst=null;
		try
		{
			PreparedStatement pstate=con.prepareStatement("select * from empdb where empid=?");
			pstate.setInt(1, eid);
			ResultSet rs=pstate.executeQuery();
			
			if(rs.next())
			{
				lst=new ArrayList<Employee>();
				eid=rs.getInt(1);
				String enm=rs.getString(2);
				double sal=rs.getDouble(3);
				Employee etemp=new Employee(eid,enm,sal);
				lst.add(etemp);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		return lst;
	}
}
/*
create table empdb(
empid number(5) primary key,
empname varchar2(30),
empsal float(40)
);

*/