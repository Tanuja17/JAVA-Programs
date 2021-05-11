package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedMulti {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javafullstack", "root", "root");
		
		for(int i=1;i<=5;i++)
		{
			String query="insert into emp values("+i+",'name"+i+"','address"+i+"')";
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.executeUpdate();
		
		}
	}

}
