package demo1;
import java.sql.*;
import java.lang.*;

public class insert_multiple {

	public static void main(String[] args) throws Exception
	{
	  String url="jdbc:mysql://localhost:3306/student";
	  String uname="root";
	  String pass="";
	  String name="Shashi";
	  String roll_no="BCA/40531/13";
	  String adm_no="2007";
	  String adress="GHATO";
	  
	  String query="insert into info values(?,?,?,?,'NULL')";
	  
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection con=DriverManager.getConnection(url,uname,pass);
	  PreparedStatement st=con.prepareStatement(query);
	 
	  
	  st.setString(1,name);
	  st.setString(2,roll_no);
	  st.setString(3,adm_no);
	  st.setString(4,adress);
	  
	  int count=st.executeUpdate();
	  
	  System.out.print(count +"rows affected");
	  
	  st.close();
	  con.close();
	  
	  
	  
	  
	  
	}

}
