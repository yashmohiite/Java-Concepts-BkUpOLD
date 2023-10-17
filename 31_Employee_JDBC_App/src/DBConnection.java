//24/01/23
import java.sql.*;
public class DBConnection {
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println("Connection to Database Successful");
		return con;
	}
}
