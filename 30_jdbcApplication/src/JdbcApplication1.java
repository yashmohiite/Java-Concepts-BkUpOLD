//18/01/23
import java.util.Scanner;
import java.sql.*;
public class JdbcApplication1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PreparedStatement pstate=null;
		Connection con=null;
		int accNo;
		String custName=null;
		float accBal=0;
		int ch=0, i=0;
		
		try {
			//Step 1 - Load Driver
			Class.forName("oracle.jdbc.OracleDriver");
			//Step 2 - Connection to Database
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
			System.out.println("Connection to Database Successfull, "+con);
		} catch (Exception e) {
		}
			do
			{
			System.out.println("1-Insert\n2-Delete\n3-Update\n4-Search\n5-Display All\n");
			System.out.println("Enter your Choice");
			ch=sc.nextInt();
			
			try
			{
				
			if(ch==1)
			{
			//Save Data in Table
			System.out.println("Enter Account No, Cust Name, Acc Bal: ");
			accNo=sc.nextInt();
			custName=sc.next();
			accBal=sc.nextFloat();
			                                                  //1 abc 1000
			pstate=con.prepareStatement("insert into Bank values(?,?,?)");
			pstate.setInt(1,  accNo);
			pstate.setString(2,  custName);
			pstate.setFloat(3, accBal);
			
			i=pstate.executeUpdate(); //Use For : insert/update/delete
			if(i>0)
			{
				System.out.println("Record Saved");
			}
			else
			{
				System.out.println("Record Not Saved");
			}
			}
			
			else if(ch==2)
			{
				pstate = con.prepareStatement("Delete from bank where accno=?");
				System.out.println("Enter account no to delete record");
				pstate.setInt(1,  sc.nextInt());
				i=pstate.executeUpdate();
				if(i>0)
					System.out.println("Record Deleted");
				else
					System.out.println("Record Not Deleted");
			}
			
			else if(ch==3)
			{
				//update accbal for given acc no...... update bank set accbal=? where accno=?
				System.out.println("Enter acc no and new bal to update in DB");
				accNo=sc.nextInt();
				accBal=sc.nextFloat();
				pstate=con.prepareStatement("update bank set accBal=? where accNo=?");
				pstate.setFloat(1, accBal);
				pstate.setInt(2, accNo);
				i=pstate.executeUpdate();
				if(i>0)
				{
					System.out.println("Record Updated");
				}
				else
				{
					System.out.println("Record not Updated");
				}
			}
			
			//19/01/23
			else if(ch==4)
			{
				System.out.println("Enter Acc No. to search:");
				accNo=sc.nextInt();
				pstate=con.prepareStatement("select * from bank where accNo=?");
				pstate.setInt(1, accNo);
				ResultSet rs=pstate.executeQuery();
				if(rs.next())
				{
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat("accBal"));
				}
				else
				{
					System.out.println("Invalid Acc No.");
				}
			}
			
			else if(ch==5)
			{
				String str="select * from bank";
				Statement state=con.createStatement();
				ResultSet rs2=state.executeQuery(str);
				ResultSetMetaData rsmd=rs2.getMetaData();
				System.out.println("\n-------------------------------------------");
				for(i=1;i<=rsmd.getColumnCount();i++)
				{
					System.out.print(rsmd.getColumnName(i)+"\t");
				}
				System.out.println("\n-------------------------------------------");
				
				while(rs2.next())
				{
					System.out.println(rs2.getInt(1)+"\t"+rs2.getString(2)+"\t\t"+rs2.getFloat("accbal"));
				}
				System.out.println("\n-------------------------------------------");
			}
			
		} 
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Do you want to Continue, Press 1");
		ch=sc.nextInt();
	}while(ch==1);
			System.out.println("---------------------THANK YOU---------------------");

}
}
/*
create table Bank(
  accNo number(5) primary key,
  custName varchar2(20),
  accBal float(20)
  );
*/