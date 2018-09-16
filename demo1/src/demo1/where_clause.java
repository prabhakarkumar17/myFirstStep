package demo1;
import java.sql.*;

public class where_clause 
{

	public static void main(String[] args) throws Exception
	{
		
				String url="jdbc:mysql://localhost:3306/student";
				String uname="root";
				String pass="";
				
				String sql="select * from info where adm_no=2005";
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,uname,pass);
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(sql);
				
				rs.next();
					
			    String user=rs.getString(1);
			    System.out.println(user);
				
				st.close();
				con.close();
				
				

			}

	}


