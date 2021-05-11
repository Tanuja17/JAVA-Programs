package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		int id,count;
		String name,add;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id:");
		id=sc.nextInt();
		System.out.println("Enter emp Name:");
		name=sc.next();
		System.out.println("Enter emp Address:");
	    add=sc.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javafullstack", "root", "root");
		String query="insert into emp values(?,?,?)";
		PreparedStatement preparedStatement=con.prepareStatement(query);
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, add);
		count=preparedStatement.executeUpdate();
		System.out.println(count+" rows affected");
		
		

	}

}
