package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class JdbcDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javafullstack", "root", "root");
		Statement stmt=con.createStatement();
		String query= "update emp set name='Anuja' where id=100";
		stmt.executeUpdate(query);
		

	}

}
