package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectStatement {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javafullstack", "root", "root");
		Statement stmt=con.createStatement();
		String query= "select *from emp";
		ResultSet rs=stmt.executeQuery(query);
		ResultSetMetaData rsm=rs.getMetaData();//to print column names
		System.out.println("-----------------------------------------------------------------------");
		System.out.println(rsm.getColumnName(1)+"   "+rsm.getColumnName(2)+" "+rsm.getColumnName(3));
		System.out.println("-----------------------------------------------------------------------");
		while(rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);//here we can specify index or columnname as an arg
			String add=rs.getString(3);
			
			System.out.println(id+"  "+ name+"  "+add);
		}
		
		
	}
}
