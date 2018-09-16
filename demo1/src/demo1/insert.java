package demo1;
import java.sql.*;
import java.lang.*;

public class insert {

	public static void main(String[] args)throws Exception
	{
		String url="jdbc:mysql://localhost:3306/student";
		String uname="root";
		String pass="";
		String sql="insert into info values('Sidharta','BCA/40534/13','2006','DEOGHAR','NULL')";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
					
		int count=st.executeUpdate(sql);
		System.out.println(count + "rows affected");
		
		st.close();
		con.close();
			
		
	}

}
