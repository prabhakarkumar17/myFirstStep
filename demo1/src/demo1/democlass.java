
package demo1;
import java.sql.*;
import java.lang.*;

public class democlass {

	public static void main(String[] args)throws Exception
	{
		String url="jdbc:mysql://localhost:3306/student";
		String uname="root";
		String pass="";
		String sql="select * from info";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next())
		{
			 String user=rs.getString(1)+":"+ rs.getString(2)+":"+rs.getInt(3)+":"+rs.getString(4);
			 System.out.println(user);
			 
		}
 		st.close();
		con.close();

	}

}
