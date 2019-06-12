package jdbc;
import java.sql.*;
public class JDBC {
public static void main(String args[]) {
	
	try {
	    String Query="SELECT * from student where rollno=2";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world?autoReconnect=true&useSSL=false","root","lakshmi2000");
		Statement st=con.createStatement();
	    ResultSet rs=st.executeQuery(Query);
	    rs.next();
	    String sname=rs.getString(2);
	    System.out.println(sname);
	    con.close();
	    
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
